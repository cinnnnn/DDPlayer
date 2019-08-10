package top.bilibililike.ddplayer.mvp.search;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.http.interceptor.SearchInterceptor;
import top.bilibililike.ddplayer.http.service.SearchService;

import static top.bilibililike.ddplayer.utils.Api.APP_HOST;

public class SearchModel implements ISearchModel {
    private SearchPresenter mPresenter;

    public SearchModel(SearchPresenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void search(String keyWord, String type) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new SearchInterceptor(type,keyWord))
                .addInterceptor(new HeaderInterceptor())
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APP_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        SearchService service = retrofit.create(SearchService.class);
        if (type.equals("normal"))
            service.search()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchBean dataBean) {
                        if (dataBean.getCode() == 0){
                            mPresenter.searchSuccess(dataBean.getData());
                        }else {
                            mPresenter.searchFailed(dataBean.getMessage());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        else if (type.equals("bangumi")) {
            service.searchBangumi()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .map(searchBangumiBean -> {
                        if (searchBangumiBean.getCode() == 0) {
                            return searchBangumiBean.getData();
                        } else {
                            mPresenter.searchFailed(searchBangumiBean.getMessage());
                            Log.d("SearchPresenter","SearchFailed "+searchBangumiBean.getMessage());
                            return searchBangumiBean.getData();
                        }
                    })
                    .subscribe(new Observer<SearchBangumiBean.DataBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(SearchBangumiBean.DataBean dataBean) {
                            mPresenter.searchSuccess(dataBean);
                        }

                        @Override
                        public void onError(Throwable e) {
                            mPresenter.searchFailed(e.toString());
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        } else if (type.equals("live")) {
            service.searchLive()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .map(searchLiveBean -> {
                        if (searchLiveBean.getCode() == 0) {
                            return searchLiveBean.getData();
                        } else {
                            mPresenter.searchFailed(searchLiveBean.getMessage());
                            Log.d("SearchPresenter","SearchFailed "+searchLiveBean.getMessage());
                            return null;
                        }

                    })
                    .subscribe(new Observer<SearchLiveBean.DataBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(SearchLiveBean.DataBean dataBean) {
                            mPresenter.searchSuccess(dataBean);
                        }

                        @Override
                        public void onError(Throwable e) {
                            mPresenter.searchFailed(e.toString());
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }


    }

}
