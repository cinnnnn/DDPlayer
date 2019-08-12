package top.bilibililike.ddplayer.mvp.playAV;

import android.media.session.PlaybackState;
import android.util.Log;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;
import top.bilibililike.ddplayer.http.interceptor.AVDetailInterceptor;
import top.bilibililike.ddplayer.http.interceptor.AVUrlInterceptor;
import top.bilibililike.ddplayer.http.interceptor.GetInterceptor;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.http.interceptor.OverSeasBangumiInterceptor;
import top.bilibililike.ddplayer.http.service.PlayAVService;

import static top.bilibililike.ddplayer.utils.Api.API_HOST;
import static top.bilibililike.ddplayer.utils.Api.APP_HOST;
import static top.bilibililike.ddplayer.utils.Api.BILIPLUS_HOST;

public class PlayAVModel implements IPlayAVModel {
    PlayAVPresenter mPresenter;

    public PlayAVModel(PlayAVPresenter presenter) {
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
                    Log.d("Playav mapToDetailBean", Thread.currentThread().toString());
                    if (avDetailBean.getCode() == 0) {
                        mPresenter.getAVDetailSuccess(avDetailBean.getData());
                        Log.d("Playav title", avDetailBean.getData().getTitle());
                        return avDetailBean;
                    } else {
                        mPresenter.getAVDetailFailed(avDetailBean.getMessage());
                        return avDetailBean;
                    }
                })
                .observeOn(Schedulers.io())
                .flatMap((Function<AVDetailBean, Observable<AVUrlBean>>) avDetailBean -> {
                    Log.d("Playav flatMap", "flatMapStart");
                    OkHttpClient urlClient = new OkHttpClient.Builder()
                            .addInterceptor(new AVUrlInterceptor(avDetailBean.getData().getAid() + "", avDetailBean.getData().getCid() + ""))
                            .addInterceptor(new HeaderInterceptor())
                            .build();
                    PlayAVService urlService = new Retrofit.Builder()
                            .baseUrl(APP_HOST)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(urlClient)
                            .build().create(PlayAVService.class);
                    Log.d("Playav flatMap", "flatMapSuccess");
                    return urlService.getAvURL();
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(avUrlBean -> {
                    Log.d("Playav mapToUrlBean", Thread.currentThread().toString());
                    if (avUrlBean.getCode() == 0) {
                        //mPresenter.getAVUrlSuccess(avUrlBean.getData());
                        return avUrlBean.getData();
                    } else {
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
                        mPresenter.getAVUrlFailed(e.toString() + " error 了");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }


    @Override
    public void getAVComment() {

    }

    @Override
    public void getBangumiData(String season, int index) {
        HashMap<String, String> detailMap = new HashMap<>();
        detailMap.put("season_id", season);
        GetInterceptor getInterceptor = new GetInterceptor(detailMap);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(getInterceptor)
                .addInterceptor(new HeaderInterceptor())
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(API_HOST)
                .build();
        PlayAVService avService = retrofit.create(PlayAVService.class);
        avService.getBangumiDetail()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .takeWhile(bangumiDetailBean -> {
                    boolean isContinue = bangumiDetailBean.getCode() == 0;
                    if (!isContinue) {
                        mPresenter.getBangumiDetailFailed(bangumiDetailBean.getMessage());
                    }
                    return isContinue;
                })
                .map(bangumiDetailBean -> {
                    if (bangumiDetailBean.getResult().getLimit() == null) {
                        mPresenter.getBangumiDetailSuccess(bangumiDetailBean.getResult());
                    }
                    return bangumiDetailBean;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .flatMap((Function<BangumiDetailBean, Observable<BangumiUrlBean>>) bangumiDetailBean -> {
                    Log.d("PlayAvModel FlatMapThre", Thread.currentThread().toString());

                    if (bangumiDetailBean.getResult().getLimit() == null) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("aid", bangumiDetailBean.getResult().getEpisodes().get(index).getAid() + "");
                        hashMap.put("cid", bangumiDetailBean.getResult().getEpisodes().get(index).getCid() + "");
                        hashMap.put("otype", "json");
                        getInterceptor.replaceParam(hashMap);
                        return avService.getBangumiUrl();
                    } else {
                        mPresenter.getOverseasBangumi(season, index);
                        return avService.getBangumiUrl();
                    }

                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .takeWhile(bangumiUrlbean -> {
                    boolean isContinue = bangumiUrlbean.getCode() == 0;
                    if (!isContinue) {
                        mPresenter.getBangumiUrlFailed(bangumiUrlbean.getMessage());
                    }
                    return isContinue;
                })
                .map(urlBean -> {
                    if (urlBean.getDash() != null) {
                        mPresenter.getBangumiUrlSuccess(urlBean.getDash());
                    } else if (urlBean.getDurl() != null) {
                        mPresenter.getBangumiUrlSuccess(urlBean.getDurl());
                    }
                    return urlBean;
                })
                .subscribe(new Observer<BangumiUrlBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BangumiUrlBean urlBean) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void getOverSeaBangumi(String season, int index) {
        HashMap<String, String> detailMap = new HashMap<>();
        detailMap.put("season", season);
        detailMap.put("season_type", "1");
        OverSeasBangumiInterceptor getInterceptor = new OverSeasBangumiInterceptor(detailMap);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(getInterceptor)
                .addInterceptor(new HeaderInterceptor())
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BILIPLUS_HOST)
                .build();
        PlayAVService avService = retrofit.create(PlayAVService.class);
        avService.getOverSeasDetail()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<BangumiDetailBean, BangumiDetailBean>() {
                    @Override
                    public BangumiDetailBean apply(BangumiDetailBean bangumiDetailBean) throws Exception {
                        if (bangumiDetailBean.getCode() == 0) {
                            if (bangumiDetailBean.getResult().getLimit() == null) {
                                mPresenter.getBangumiDetailSuccess(bangumiDetailBean.getResult());
                                return bangumiDetailBean;
                            } else {
                                mPresenter.getBangumiDetailFailed(bangumiDetailBean.getResult().getLimit().getContent());
                            }
                        } else {
                            mPresenter.getBangumiDetailFailed(bangumiDetailBean.getMessage());
                            return null;
                        }
                        return null;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .flatMap((Function<BangumiDetailBean, Observable<BangumiUrlBean>>) bangumiDetailBean -> {
                    Log.d("PlayAvModel FlatMapThre", Thread.currentThread().toString());
                    if (bangumiDetailBean.getCode() == 0) {
                        if (bangumiDetailBean.getResult().getLimit() == null) {
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("aid", bangumiDetailBean.getResult().getEpisodes().get(index).getAid() + "");
                            hashMap.put("cid", bangumiDetailBean.getResult().getEpisodes().get(index).getCid() + "");
                            hashMap.put("otype", "json");
                            hashMap.put("module", "bangumi");
                            getInterceptor.replaceParam(hashMap);
                            return avService.getOverseasUrl();
                        } else {
                            mPresenter.getOverseasBangumi(season, index);
                            return null;
                        }
                    }
                    return null;
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(urlBean -> {
                    Log.d("PlayAvModel MapThread", Thread.currentThread().toString());
                    if (urlBean.getCode() == 0) {
                        if (urlBean.getDash() != null) {
                            mPresenter.getBangumiUrlSuccess(urlBean.getDash());
                        } else if (urlBean.getDurl() != null) {
                            mPresenter.getBangumiUrlSuccess(urlBean.getDurl());
                        }
                    } else {
                        mPresenter.getBangumiUrlFailed(urlBean.getMessage());
                        return urlBean;
                    }
                    return null;
                })
                .subscribe(new Observer<BangumiUrlBean>() {

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BangumiUrlBean urlBean) {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
