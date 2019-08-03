package top.bilibililike.ddplayer.http.interceptor;



import org.jetbrains.annotations.NotNull;


import java.io.IOException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.utils.MD5Util;

public class PostInterceptor implements Interceptor {

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {

        Request request = chain.request();
        //   if (request.method().equals("POST")){
        // formBody : formBody对象是Content-Type为application/x-www-form-urlencoded
        // requestBody 是 application/json
        //     if (request.body() instanceof FormBody){

        HashMap<String, String> paramMap = Api.getParams();

        FormBody formBody = (FormBody) request.body();

        for (int i = 0; i < (formBody != null ? formBody.size() : 0); i++) {
            paramMap.put(formBody.name(i), formBody.value(i));
        }
        List<String> paramList = new ArrayList<>(paramMap.keySet());
        Collections.sort(paramList);

        FormBody.Builder bodyBuilder = new FormBody.Builder();
        StringBuilder signBuilder = new StringBuilder();
        for (int i = 0; i < paramList.size(); i++) {

            signBuilder.append(paramList.get(i)).append("=").append(URLEncoder.encode(paramMap.get(paramList.get(i))));

            if ((i + 1) < paramList.size()) {
                signBuilder.append("&");
            }
            bodyBuilder.add(paramList.get(i), paramMap.get(paramList.get(i)));
        }
        signBuilder.append(Api.appsecret);
        String signString = signBuilder.toString();


        bodyBuilder.add("sign", MD5Util.getMD5(signString));
        formBody = bodyBuilder.build();

        request = request.newBuilder()
                .method(request.method(),formBody)
                .build();
        //      }
        //  }


        return chain.proceed(request);
    }




}
