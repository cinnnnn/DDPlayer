package top.bilibililike.ddplayer.mvp.userInfo;

import android.util.Log;

import org.litepal.LitePal;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.http.interceptor.GetInterceptor;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.http.service.UserInfoService;
import top.bilibililike.ddplayer.entity.UserInfoBean;
import top.bilibililike.ddplayer.utils.Api;

public class UserInfoModel implements IUserInfoModel {
    UserInfoPresenter presenter;
    public UserInfoModel(UserInfoPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void getUserInfo() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new GetInterceptor())
                .addInterceptor(new HeaderInterceptor())
                .build();
        Log.d("UserInfoModel get","我执行get请求了");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.APP_HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        UserInfoService infoService = retrofit.create(UserInfoService.class);

        Observable<UserInfoBean> observable = infoService.getUserInfo();

        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<UserInfoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserInfoBean userInfoBean) {

                        if (userInfoBean.getCode() == 0){
                            if (LitePal.find(UserInfoBean.DataBean.class,1) == null){
                                userInfoBean.getData().save();
                            }else {
                                userInfoBean.getData().update(1);
                            }
                            presenter.getUserInfoSucceed();
                        }else {
                            presenter.getUserInfoFailed(userInfoBean.getMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        presenter.getUserInfoFailed(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
