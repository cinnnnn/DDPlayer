package top.bilibililike.ddplayer.http.service;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;

public interface PlayAVService {
    @GET("/x/v2/view")
    Observable<AVDetailBean> getAvDetail(
           /* @Query("aid") String aid,
            @Query("ad_extra") String ad_extra ,
            @Query("autoplay") String autoplay,
            @Query("fnval") String fnval,
            @Query("fnver") String fnver,
            @Query("force_host") String force_host,
            @Query("fourk") String fourk,
            @Query("from") String from,
            @Query("from_spmid") String from_spmid,
            @Query("plat") String plat,
            @Query("qn") String qn,
            @Query("spmid") String spmid,
            @Query("trackid") String trackid*/


                                         );

    @GET("x/playurl")
    Observable<AVUrlBean> getAvURL(/*@Query("mid") String mid,
                                   @Query("cid") String cid,
                                   @Query("aid") String aid,
                                   @Query("expire") String expire,
                                   @Query("force_host") String force_host,
                                   @Query("fnval") String fnval,
                                   @Query("qn") String qn,
                                   @Query("npcybs") String npcybs,
                                   @Query("actionkey") String actionkey,
                                   @Query("from_spmid") String from_spmid,
                                   @Query("otype") String otype,
                                   @Query("fourk") String fourk,
                                   @Query("fnver") String fnver,
                                   @Query("buvid") String buvid,
                                   @Query("spmid") String spmid*/
    );

    @GET("pgc/view/app/season")
    Observable<BangumiDetailBean> getBangumiDetail();

    @GET("pgc/player/api/playurl")
    Observable<BangumiUrlBean> getBangumiUrl();


    @Headers("User-Agent:Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1")
    @GET("/{id}")
    Observable<ResponseBody> getBigoData(@Path("id")String id);

}
