package top.bilibililike.ddplayer.http.service;

import io.reactivex.Observable;
import retrofit2.http.GET;
import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;

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

    //https://www.biliplus.com/BPplayurl.php?avid=61306392&cid=106650586&otype=json&module=bangumi
    @GET("BPplayurl.php")
    Observable<BangumiUrlBean> getOverseasUrl();

    //https://www.biliplus.com/api/bangumi?season_type=1&season=28050
    @GET("api/bangumi")
    Observable<BangumiDetailBean> getOverSeasDetail();


}
