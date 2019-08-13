package top.bilibililike.ddplayer.test;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;
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
    }


}
