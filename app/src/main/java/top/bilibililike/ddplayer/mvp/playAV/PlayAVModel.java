package top.bilibililike.ddplayer.mvp.playAV;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.AVDetailBean;
import top.bilibililike.ddplayer.entity.AVUrlBean;
import top.bilibililike.ddplayer.http.interceptor.AVDetailInterceptor;
import top.bilibililike.ddplayer.http.interceptor.AVUrlInterceptor;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.http.service.PlayAVService;

import static top.bilibililike.ddplayer.utils.Api.APP_HOST;

public class PlayAVModel implements IPlayAVModel {
    PlayAVPresenter mPresenter;
    public PlayAVModel(PlayAVPresenter presenter){
        this.mPresenter = presenter;
    }

    @Override
    public void getAVDetailData(String aid) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new AVDetailInterceptor(aid))
                .addInterceptor(new HeaderInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APP_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        PlayAVService service = retrofit.create(PlayAVService.class);

        service.getAvDetail()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(avDetailBean -> {
                    Log.d("Playav mapToDetailBean",Thread.currentThread().toString());
                    if (avDetailBean.getCode() == 0){
                        mPresenter.getAVDetailSuccess(avDetailBean.getData());
                        Log.d("Playav title",avDetailBean.getData().getTitle());
                        return avDetailBean;
                    }else {
                        mPresenter.getAVDetailFailed(avDetailBean.getMessage());
                        return avDetailBean;
                    }
                })
                .observeOn(Schedulers.io())
                .flatMap((Function<AVDetailBean, Observable<AVUrlBean>>) avDetailBean -> {
                    Log.d("Playav flatMap","flatMapStart");
                    OkHttpClient urlClient = new OkHttpClient.Builder()
                            .addInterceptor(new AVUrlInterceptor(avDetailBean.getData().getAid()+"",avDetailBean.getData().getCid()+""))
                            .addInterceptor(new HeaderInterceptor())
                            .build();
                    PlayAVService urlService = new Retrofit.Builder()
                            .baseUrl(APP_HOST)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(urlClient)
                            .build().create(PlayAVService.class);
                    Log.d("Playav flatMap","flatMapSuccess");
                    return urlService.getAvURL();
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(avUrlBean -> {
                    Log.d("Playav mapToUrlBean",Thread.currentThread().toString());
                    if (avUrlBean.getCode() == 0){
                        //mPresenter.getAVUrlSuccess(avUrlBean.getData());
                        return avUrlBean.getData();
                    }else {
                        mPresenter.getAVUrlFailed(avUrlBean.getMessage());
                        return avUrlBean.getData();
                    }
                })
                .subscribe(new Observer<AVUrlBean.DataBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AVUrlBean.DataBean dataBean) {
                        mPresenter.getAVUrlSuccess(dataBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mPresenter.getAVUrlFailed(e.toString()+" error 了");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }



    @Override
    public void getAVComment() {

    }
}
