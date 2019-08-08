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
import top.bilibililike.ddplayer.entity.UserInfoBean;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.utils.MD5Util;

public class AVDetailInterceptor implements Interceptor {
    private String aid;

    public AVDetailInterceptor(String aid) {
        this.aid = aid;
    }


    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        TokenBean.DataBean.TokenInfoBean infoBean = LitePal.find(TokenBean.DataBean.TokenInfoBean.class, 1);

        Request request = chain.request();
        HashMap<String, String> paramMap = Api.getParams();
        if (infoBean != null) {
            paramMap.put("access_key", infoBean.getAccess_token());
        }


        paramMap.put("ad_extra", "0");
        paramMap.put("aid", aid);
        paramMap.put("autoplay", "0");
        paramMap.put("fnval", "16");
        paramMap.put("fnver", "0");
        paramMap.put("force_host", "0");
        paramMap.put("fourk", "0");
        paramMap.put("from", "7");
        paramMap.put("from_spmid", "tm.recommend.0.0");
        paramMap.put("plat", "0");
        paramMap.put("qn", "32");
        paramMap.put("spmid", "0");
        paramMap.put("trackid", "all_16.shylf-ai-recsys-87.1564645385020.392");


        HttpUrl httpUrl = request.url();

        //httpUrl.queryParameterNames();
        List<String> queryNames = new ArrayList<>(httpUrl.queryParameterNames());
        for (String param : queryNames
        ) {
            paramMap.put(param, httpUrl.queryParameterValues(param).get(0));
        }
        List<String> paramNames = new ArrayList<>(paramMap.keySet());
        Collections.sort(paramNames);

        HttpUrl.Builder builder = httpUrl.newBuilder();
        StringBuilder signBuilder = new StringBuilder();
        for (int i = 0; i < paramNames.size(); i++) {
            builder.addQueryParameter(paramNames.get(i), paramMap.get(paramNames.get(i)));
            signBuilder.append(paramNames.get(i)).append("=").append(URLEncoder.encode(paramMap.get(paramNames.get(i))));
            if ((i + 1) < paramNames.size()) {
                signBuilder.append("&");
            }
        }

        signBuilder.append(Api.appsecret);

        Log.d("DetailInte signText", signBuilder.toString());
        Log.d("DetailInte sign", MD5Util.getMD5(signBuilder.toString()));
        builder.addQueryParameter("sign", MD5Util.getMD5(signBuilder.toString()));
        httpUrl = builder.build();

        request = request.newBuilder().url(httpUrl).build();


        return chain.proceed(request);
    }
}
