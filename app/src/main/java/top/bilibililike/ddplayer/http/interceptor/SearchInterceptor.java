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
import top.bilibililike.ddplayer.mvp.search.SearchPresenter;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.utils.MD5Util;

public class SearchInterceptor implements Interceptor {
    String type;
    String keyword;
    public SearchInterceptor(String type,String keyword){
        this.type = type;
        this.keyword = keyword;
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
        if (type.equals("live")){
            paramMap.put("type","4");
        }else if (type.equals("bangumi")){
            paramMap.put("type","7");
        }
        paramMap.put("keyword",keyword);
        paramMap.put("pn","1");
        paramMap.put("ps","20");

        HttpUrl httpUrl = request.url();
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
        builder.addQueryParameter("sign", MD5Util.getMD5(signBuilder.toString()));
        httpUrl = builder.build();
        request = request.newBuilder().url(httpUrl).build();


        return chain.proceed(request);
    }
}
