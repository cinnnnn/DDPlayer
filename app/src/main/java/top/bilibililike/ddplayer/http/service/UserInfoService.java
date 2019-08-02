package top.bilibililike.ddplayer.http.service;



import io.reactivex.Observable;
import retrofit2.http.GET;
import top.bilibililike.ddplayer.entity.UserInfoBean;

public interface UserInfoService {

    @GET("/x/v2/account/mine")
    Observable<UserInfoBean> getUserInfo();
}
