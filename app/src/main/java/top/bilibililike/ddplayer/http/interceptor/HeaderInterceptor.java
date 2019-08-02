package top.bilibililike.ddplayer.http.interceptor;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {
    private LinkedHashMap<Object,Object> headers;
    public HeaderInterceptor(LinkedHashMap<Object,Object> headers){
        this.headers = headers;
    }
    public HeaderInterceptor(){

    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("UserBean-Agent","Mozilla/5.0 BiliDroid/5.41.0 (bbcallen@gmail.com)")
                .addHeader("Buvid","XZ3B2B93A770D6969B54AB127B42DB2031888")
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .build();
        if (headers!=null){
            List keySet = new ArrayList<>(headers.keySet());
            for (int i = 0; i < keySet.size(); i++) {
                if ( (headers.get(keySet.get(i)) != null)){
                    request = request.newBuilder()
                            .addHeader(keySet.get(i).toString(), Objects.requireNonNull(headers.get(keySet.get(i))).toString())
                            .build();
                }

            }
        }



        return chain.proceed(request);
    }
}
