package top.bilibililike.ddplayer.http.service;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import top.bilibililike.ddplayer.entity.TokenBean;

public interface LoginService {
    @FormUrlEncoded
    @POST("api/v3/oauth2/login")
    Observable<TokenBean> getData(@Field("username") String username,
                                  @Field("password") String password,
                                  @Field("ts") String ts

    );

    @FormUrlEncoded
    @POST("api/v3/oauth2/login")
    Call<TokenBean> getDataCall(@Field("username") String username,
                                @Field("password") String password,
                                @Field("ts") String ts

    );



}
