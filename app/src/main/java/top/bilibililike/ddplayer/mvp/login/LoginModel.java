package top.bilibililike.ddplayer.mvp.login;

import android.util.Base64;
import android.util.Log;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import org.litepal.LitePal;


import java.io.IOException;

import java.net.URLEncoder;
import java.security.Key;
import java.security.KeyFactory;

import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.LinkedHashMap;


import javax.crypto.Cipher;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.LoginBean;
import top.bilibililike.ddplayer.entity.TokenBean;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.http.service.LoginService;
import top.bilibililike.ddplayer.http.interceptor.PostInterceptor;
import top.bilibililike.ddplayer.utils.Api;

import static javax.crypto.Cipher.ENCRYPT_MODE;
import static top.bilibililike.ddplayer.utils.Api.LOGIN_HOST;

public class LoginModel implements ILoginModel {
    private LoginPresenter presenter;




    LoginModel(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void login(String username, String password) {
        LinkedHashMap<Object, Object> headerMap = new LinkedHashMap<>();
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .addNetworkInterceptor(chain -> {

                    String cookie;
                    Request request = chain.request();
                    Response response = chain.proceed(request);
                    cookie = response.header("Set-Cookie");
                    if (cookie != null && cookie.contains(";")) {
                        cookie = cookie.split(";")[0];
                        headerMap.put("Cookie", cookie);
                    }
                    return response;
                })
                .addInterceptor(new HeaderInterceptor(headerMap))
                .addInterceptor(new PostInterceptor())
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(LOGIN_HOST)
                .client(client)
                .build();
        LoginService service = retrofit.create(LoginService.class);
        service.login(username,password)
                .flatMap(new Function<LoginBean, Observable<TokenBean>>() {
                    @Override
                    public Observable<TokenBean> apply(LoginBean loginBean) {
                        if (loginBean.getCode() == 0){
                            return service.getData(username,getPassword(password,loginBean),loginBean.getTs()+"");
                        }else {
                            presenter.getHashFailed(loginBean.getMessage());
                        }
                        return null;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TokenBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TokenBean tokenBean) {
                        if (tokenBean == null || tokenBean.getCode() != 0) {
                            presenter.loginFailed(tokenBean.getMessage());
                        } else {
                            presenter.loginSuccess();
                            if (LitePal.find(TokenBean.DataBean.TokenInfoBean.class, 1) == null) {
                                tokenBean.getData().getToken_info().save();
                            } else {
                                tokenBean.getData().getToken_info().update(1);
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        //presenter.loginFailed(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }


    private String getKey(String publicKey) {
        StringBuilder result = new StringBuilder();
        String[] keys = publicKey.split("\n");
        for (int i = 0; i < keys.length; i++) {
            keys[i] = keys[i].replaceAll("\n", "");
            if (keys[i].charAt(0) != '-') {
                result.append(keys[i]);
            }
        }
        return result.toString();
    }

    private String getPassword(String password,LoginBean bean) {
        //  deal with passWord
        String hash = bean.getData().getHash();
        String publicKey = getKey(bean.getData().getKey());
        String finalPassword = "";

        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(publicKey, Base64.DEFAULT));
            Key key = KeyFactory.getInstance("RSA")
                    .generatePublic(x509EncodedKeySpec);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

            cipher.init(ENCRYPT_MODE, key);
            finalPassword = Base64.encodeToString(cipher.doFinal((hash + password).getBytes()), Base64.DEFAULT);
            Log.d("LoginModel encode密码 ", URLEncoder.encode(finalPassword));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("LoginModel ", "公钥 : " + publicKey);
        Log.d("LoginModel ", "密码 : " + finalPassword);

        return finalPassword;
    }




}
