package top.bilibililike.ddplayer.mvp.homeRecommend;

import android.util.Log;

import java.lang.annotation.Repeatable;
import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.AvListBean;
import top.bilibililike.ddplayer.http.interceptor.GetInterceptor;
import top.bilibililike.ddplayer.http.service.VideoListService;

import static top.bilibililike.ddplayer.utils.Api.APP_HOST;

public class RecommendModel implements IRecommendModel {
    private RecommendPresenter mPresenter;
    public RecommendModel(RecommendPresenter presenter){
        this.mPresenter = presenter;
    }


    @Override
    public void getData(boolean isRefresh) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new GetInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APP_HOST)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        VideoListService service = retrofit.create(VideoListService.class);

        service.getRecommendList("0")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AvListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AvListBean avListBean) {
                        Log.d("RecommendModel",avListBean.getMessage());
                        if (avListBean.getCode() == 0){
                            mPresenter.loadListSuccess(avListBean.getData().getItems(),isRefresh);
                        }else {
                            mPresenter.loadListFailed(avListBean.getMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mPresenter.loadListFailed(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
