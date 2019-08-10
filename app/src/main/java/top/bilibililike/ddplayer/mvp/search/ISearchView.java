package top.bilibililike.ddplayer.mvp.search;

import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;

public interface ISearchView {
    void searchSuccess(SearchBean.DataBean dataBean);

    void searchSuccess(SearchBangumiBean.DataBean dataBean);

    void searchSuccess(SearchLiveBean.DataBean dataBean);
}
