package top.bilibililike.ddplayer.mvp.homeRecommend;


import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
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
    private List<AvListBean.DataBean.ItemsBean> itemList;

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

        Subscriber<AvListBean.DataBean.ItemsBean> subscriber = new Subscriber<AvListBean.DataBean.ItemsBean>() {
            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(AvListBean.DataBean.ItemsBean itemsBean) {
                if (itemList == null) itemList = new ArrayList<>();
                if (itemsBean.getCard_goto().equals("av")) itemList.add(itemsBean);
                mPresenter.loadListSuccess(itemList, isRefresh);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };


        service.getRecommendList("0")
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation())
                .map(new Function<AvListBean, List<AvListBean.DataBean.ItemsBean>>() {
                    @Override
                    public List<AvListBean.DataBean.ItemsBean> apply(AvListBean bean) throws Exception {
                        List<AvListBean.DataBean.ItemsBean> beanList = new ArrayList<>();
                        if (bean.getCode() == 0){
                            for (AvListBean.DataBean.ItemsBean item:bean.getData().getItems()) {
                                if (item.getCard_goto().equals("av")){
                                    beanList.add(item);
                                }
                            }
                        }
                        return beanList;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<AvListBean.DataBean.ItemsBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(List<AvListBean.DataBean.ItemsBean> itemsBeans) {
                        if (itemsBeans.size() > 0){
                            mPresenter.loadListSuccess(itemsBeans,isRefresh);
                        }else {
                            mPresenter.loadListFailed();
                        }
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
