package top.bilibililike.ddplayer.http.interceptor;

import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.litepal.LitePal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import top.bilibililike.ddplayer.entity.TokenBean;

public class OverSeasBangumiInterceptor implements Interceptor {
    private HashMap<String,String> paramMap;
    public OverSeasBangumiInterceptor(HashMap<String,String> paramMap){
        this.paramMap = paramMap;
    }
    public OverSeasBangumiInterceptor(){

    }
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        TokenBean.DataBean.TokenInfoBean tokenInfoBean = LitePal.find(TokenBean.DataBean.TokenInfoBean.class,1);
        Request request = chain.request();
        HashMap<String, String> paramMap = new HashMap<>();
        if (tokenInfoBean != null){
            paramMap.put("access_key",tokenInfoBean.getAccess_token());
        }
        if (this.paramMap != null){
            paramMap.putAll(this.paramMap);
        }

        HttpUrl httpUrl = request.url();
        List<String> paramNames = new ArrayList<>(paramMap.keySet());
        Collections.sort(paramNames);
        HttpUrl.Builder builder = httpUrl.newBuilder();
        for (int i = 0; i < paramNames.size(); i++) {
            builder.addQueryParameter(paramNames.get(i),paramMap.get(paramNames.get(i)));
        }
        httpUrl = builder.build();
        Log.d("OverSeasInterceptor",httpUrl.toString());
        request = request.newBuilder().url(httpUrl).build();
        return chain.proceed(request);
    }

    public void replaceParam(HashMap<String,String> param){
        if (paramMap == null) {
            paramMap = new HashMap<>();
        }else {
            paramMap.clear();
        }
        paramMap.putAll(param);
    }
}