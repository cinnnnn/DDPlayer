package top.bilibililike.ddplayer.test;

import android.app.ActivityManager;
import android.util.Log;

import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.LoginBean;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;
import top.bilibililike.ddplayer.http.service.LoginService;
import top.bilibililike.ddplayer.utils.Util;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //http://www.bigo.tv/314459540  http://www.bigo.tv/302006359
                .url("http://www.bigo.tv/302006359")
                .header("User-Agent","Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1")
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String result = Util.bigoWebToJson(response.body().string());
                System.out.println(result);
                Gson gson = new Gson();
                BigoLiveBean bean = gson.fromJson(result,BigoLiveBean.class);
                System.out.println(bean.getBigoID());
            }
        });
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();




        LoginService loginService = retrofit.create(LoginService.class);

        loginService.call()
                .enqueue(new retrofit2.Callback<LoginBean>() {
                    @Override
                    public void onResponse(retrofit2.Call<LoginBean> call, retrofit2.Response<LoginBean> response) {

                    }

                    @Override
                    public void onFailure(retrofit2.Call<LoginBean> call, Throwable t) {

                    }
                });

        try {
            loginService.call()
                    .execute();
        } catch (IOException e) {
            e.printStackTrace();
        }


        loginService.login("1","2")
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {

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
