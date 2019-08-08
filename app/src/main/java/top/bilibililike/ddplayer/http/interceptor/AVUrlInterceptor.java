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

public class AVUrlInterceptor implements Interceptor {

    private String aid;
    private String cid;

    public AVUrlInterceptor(String aid, String cid) {
        this.aid = aid;
        this.cid = cid;
    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        TokenBean.DataBean.TokenInfoBean infoBean = LitePal.find(TokenBean.DataBean.TokenInfoBean.class, 1);

        Request request = chain.request();
        HashMap<String, String> paramMap = Api.getParams();
        paramMap.remove("appkey");
        paramMap.remove("statistics");
        paramMap.remove("channel");

        if (infoBean != null) {
            paramMap.put("access_key", infoBean.getAccess_token());
        }
        paramMap.put("ad_extra", "0");
        paramMap.put("actionkey", "appkey");
        paramMap.put("aid", aid);
        paramMap.put("appkey", Api.videoAppkey);
        paramMap.put("buvid", "XZ3B2B93A770D6969B54AB127B42DB2031888");
        paramMap.put("cid", cid);
        paramMap.put("device", "android");
        paramMap.put("expire", "1567060310");
        paramMap.put("fnval", "16");
        paramMap.put("fnver", "0");
        paramMap.put("force_host", "0");
        paramMap.put("fourk", "0");
        paramMap.put("from_spmid", "tm.recommend.0.0");
        paramMap.put("mid", "0");
        paramMap.put("npcybs", "0");
        paramMap.put("otype", "json");
        paramMap.put("qn", "32");
        paramMap.put("spmid", "main.ugc-video-detail.0.0");


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

        signBuilder.append(Api.videosecret);


        Log.d("DetailInte signText", signBuilder.toString());
        Log.d("DetailInte sign", MD5Util.getMD5(signBuilder.toString()));
        builder.addQueryParameter("sign", MD5Util.getMD5(signBuilder.toString()));
        httpUrl = builder.build();

        request = request.newBuilder().url(httpUrl).build();


        return chain.proceed(request);
    }
}
