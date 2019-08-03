package top.bilibililike.ddplayer.mvp.homeRecommend;

import android.util.Log;


import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.Synchronized;
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
    public void getAvData(boolean isRefresh) {
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
                /*.map(bean -> {
                    List<AvListBean.DataBean.ItemsBean> itemBeanList = bean.getData().getItems();
                    if (bean.getCode() == 0){
                        Log.d("RecommendModel map()", String.valueOf(Thread.currentThread()));

                        for (AvListBean.DataBean.ItemsBean itemsBean:itemBeanList) {
                            if (!itemsBean.getCard_goto().equals("av")){
                                itemBeanList.remove(itemsBean);
                            }
                        }
                        Log.d("RecommendModel map()", "for循环执行完了");
                        mPresenter.loadListSuccess(itemBeanList,isRefresh);
                        return itemBeanList;
                    }else {
                        mPresenter.loadListFailed(bean.getMessage());
                    }
                    Log.d("RecommendModel map()", "我已经Return了");
                    return bean.getData().getItems();
                })*/
                .map(new Function<AvListBean, AvListBean>() {
                    @Override
                    public AvListBean apply(AvListBean bean) throws Exception {
                        if (bean.getCode() == 0){
                            return bean;
                        }else {
                            mPresenter.loadListFailed(bean.getMessage());
                        }
                        return null;
                    }
                })
                .subscribe(new Observer<AvListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AvListBean bean) {
                        List<AvListBean.DataBean.ItemsBean> beanList = bean.getData().getItems();
                        Observable.just(beanList)
                                .subscribeOn(Schedulers.io())
                                .map(itemsBeans -> {
                                    for (AvListBean.DataBean.ItemsBean itemsBean:beanList) {
                                        if (!itemsBean.getCard_goto().equals("av")){
                                            beanList.remove(itemsBean);
                                        }
                                    }
                                    return beanList;
                                })
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Observer<List<AvListBean.DataBean.ItemsBean>>() {
                                    @Override
                                    public void onSubscribe(Disposable d) {

                                    }

                                    @Override
                                    public void onNext(List<AvListBean.DataBean.ItemsBean> itemsBeans) {
                                        mPresenter.loadListSuccess(itemsBeans,isRefresh);
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
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
