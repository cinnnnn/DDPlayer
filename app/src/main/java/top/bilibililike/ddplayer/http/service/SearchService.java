package top.bilibililike.ddplayer.http.service;



import io.reactivex.Observable;
import retrofit2.http.GET;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;

public interface SearchService {
    @GET("x/v2/search")
    Observable<SearchBean> search();

    @GET("x/v2/search/type")
    Observable<SearchBangumiBean> searchBangumi();

    @GET("x/v2/search/live")
    Observable<SearchLiveBean> searchLive();

}
