package top.bilibililike.ddplayer.mvp.bigoLive;

import android.util.Log;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;
import top.bilibililike.ddplayer.http.service.PlayAVService;
import top.bilibililike.ddplayer.utils.Util;
import top.bilibililike.ddplayer.utils.groceries.LenientGsonConverterFactory;

public class BigoModel implements IBigoModel {
    //http://www.bigo.tv/sid/2407526888
    //http://www.bigo.tv/302006359
    //这两种都可以 一个是sid 一个是用户个人id
    private BigoPresenter mPresenter;
    public BigoModel(BigoPresenter presenter){
        this.mPresenter = presenter;
    }

    @Override
    public void getBigoLiveData(String url, boolean isRefresh) {
       /* OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //http://www.bigo.tv/314459540  http://www.bigo.tv/302006359
                .url(url)
                .header("User-Agent","Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1")
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                String resultJson = Util.bigoWebToJson(response.body().string());
                BigoLiveBean liveBean = new Gson().fromJson(resultJson,BigoLiveBean.class);

                mPresenter.getDataSuccess(liveBean,isRefresh);
            }
        });*/


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bigo.tv/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(LenientGsonConverterFactory.create())
                .build();

        PlayAVService service = retrofit.create(PlayAVService.class);
        service.getBigoData(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<ResponseBody, BigoLiveBean>() {
                    @Override
                    public BigoLiveBean apply(ResponseBody responseBody) throws Exception {
                        String s = responseBody.string();
                        Gson gson = new Gson();
                        System.out.println(s.length());
                        Log.d("BigoModel",s);
                        BigoLiveBean liveBean = gson.fromJson(Util.bigoWebToJson(s),BigoLiveBean.class);
                        return liveBean;
                    }
                })

                .subscribe(new Observer<BigoLiveBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(BigoLiveBean liveBean) {
                mPresenter.getDataSuccess(liveBean,isRefresh);
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
