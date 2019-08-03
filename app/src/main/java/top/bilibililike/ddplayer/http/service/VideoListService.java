package top.bilibililike.ddplayer.http.service;

import io.reactivex.Observable;
import kotlin.jvm.Synchronized;
import retrofit2.http.GET;
import retrofit2.http.Query;
import top.bilibililike.ddplayer.entity.AvListBean;

public interface VideoListService {

    @GET("x/v2/feed/index")
    Observable<AvListBean> getRecommendList(@Query("login_event") String logEvent);
}
