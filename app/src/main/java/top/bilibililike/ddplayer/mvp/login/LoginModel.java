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
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
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
    private LoginBean bean;

    private String cookie;

    LoginModel(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void doLogin(String username, String password) {
        LinkedHashMap<Object, Object> headerMap = new LinkedHashMap<>();
        headerMap.put("Cookie", cookie);
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .addInterceptor(new HeaderInterceptor(headerMap))
                .addInterceptor(new PostInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LOGIN_HOST)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        LoginService loginService = retrofit.create(LoginService.class);

        Observable<TokenBean> observable = loginService.getData(username, getPassword(password), bean.getTs() + "");
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TokenBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TokenBean tokenBean) {
                        if (tokenBean.getCode() != 0) {
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
                        presenter.loginFailed(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    @Override
    public void getHash() {
        //这个比较固定  就直接写死了吧 简单点
        ArrayList<String> keys = new ArrayList<String>();
        keys.add("appkey");

        ArrayList<String> values = new ArrayList<String>();
        values.add(Api.appkey);
        //  values.add("17004c193f688f0b5665c1068e733aff");
        // values.add("9ced7046e0672275ae92edffe8cb447a");
        OkHttpClient client = new OkHttpClient.Builder()
                .addNetworkInterceptor(chain -> {
                    Request request = chain.request();
                    Response response = chain.proceed(request);

                    cookie = response.header("Set-Cookie");
                    if (cookie != null && cookie.contains(";")) {
                        cookie = cookie.split(";")[0];
                    }
                    Log.d("LoginModel ", "cookieGet = " + cookie);
                    return response;
                })
                .addInterceptor(new PostInterceptor())
                .build();
        Request request = new Request.Builder()
                .url("https://passport.bilibili.com/api/oauth2/getKey?appkey=1d8b6e7d45233436")
                .addHeader("Host", "passport.bilibili.com")
                .post(new FormBody(keys, values))
                .build();
        okhttp3.Call call = client.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {
                presenter.getHashFailed(e.toString());
            }

            @Override
            public void onResponse(@NotNull okhttp3.Call call, @NotNull Response response) throws IOException {
                ResponseBody body = response.body();
                String data = "";
                if (body != null) {
                    data = body.string();
                }
                Log.d("LoginModel.java", data);
                Gson gson = new Gson();
                bean = gson.fromJson(data, LoginBean.class);
                if (bean.getCode() == 0) {
                    presenter.getHashSuccess();
                } else {
                    presenter.getHashFailed(bean.getMessage());
                }

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

    private String getPassword(String password) {
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
