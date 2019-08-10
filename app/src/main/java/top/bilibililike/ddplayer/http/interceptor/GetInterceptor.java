package top.bilibililike.ddplayer.http.interceptor;

import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.litepal.LitePal;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import top.bilibililike.ddplayer.entity.TokenBean;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.utils.MD5Util;

public class GetInterceptor implements Interceptor {
    private HashMap<String,String> paramMap;
    public GetInterceptor(HashMap<String,String> paramMap){
        this.paramMap = paramMap;
    }
    public GetInterceptor(){

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
        paramMap.putAll(Api.getParams());
        if (this.paramMap != null){
            paramMap.putAll(this.paramMap);
        }

        HttpUrl httpUrl = request.url();

        httpUrl.queryParameterNames();
        List<String> queryNames = new ArrayList<>(httpUrl.queryParameterNames());
        for (String param:queryNames){
            Log.d("GetInterceptor",param);
            paramMap.put(param,httpUrl.queryParameterValues(param).get(0));
        }
        List<String> paramNames = new ArrayList<>(paramMap.keySet());
        Collections.sort(paramNames);

        HttpUrl.Builder builder = httpUrl.newBuilder();
        StringBuilder signBuilder = new StringBuilder();
        for (int i = 0; i < paramNames.size(); i++) {
            builder.addQueryParameter(paramNames.get(i),paramMap.get(paramNames.get(i)));
            signBuilder.append(paramNames.get(i)).append("=").append(URLEncoder.encode(paramMap.get(paramNames.get(i))));
            if ((i + 1) < paramNames.size()) {
                signBuilder.append("&");
            }
        }
        signBuilder.append(Api.appsecret);
        Log.d("GetInterceptor sign",signBuilder.toString());
        builder.addQueryParameter("sign",MD5Util.getMD5(signBuilder.toString()));
        httpUrl = builder.build();
        Log.d("GetInterceptor",httpUrl.toString());
        request = request.newBuilder().url(httpUrl).build();


        return chain.proceed(request);
    }

    public void replaceParam(HashMap<String,String> param){
        if (paramMap == null) {
            paramMap = new HashMap<>();
        }else {
            paramMap.clear();
            paramMap.putAll(Api.getParams());
        }
        paramMap.putAll(param);
    }
}
