package top.bilibililike.ddplayer.http.httpUtil;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.bilibililike.ddplayer.http.interceptor.GetInterceptor;
import top.bilibililike.ddplayer.http.interceptor.HeaderInterceptor;
import top.bilibililike.ddplayer.utils.Api;

public class GetService {
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(Api.APP_HOST)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

    private static Retrofit retrofit = builder.client(httpClient
            .addInterceptor(new GetInterceptor())
            .addInterceptor(new HeaderInterceptor(null))
            .build()).build();

    public static <S> S createService(Class<S>  serviceClass) {
        return retrofit.create(serviceClass);
    }


}
