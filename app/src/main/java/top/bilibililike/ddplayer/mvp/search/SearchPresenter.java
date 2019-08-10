package top.bilibililike.ddplayer.mvp.search;

import android.util.Log;

import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;

public class SearchPresenter<T> {
    private ISearchView mSearchView;
    private ISearchModel mModel;
    public SearchPresenter(ISearchView searchView){
        mSearchView = searchView;
        mModel = new SearchModel(this);
    }


    public void searchSuccess(SearchBean.DataBean dataBean){
        mSearchView.searchSuccess(dataBean);
    }

    public void searchSuccess(SearchBangumiBean.DataBean dataBean){
        mSearchView.searchSuccess(dataBean);
    }

    public void searchSuccess(SearchLiveBean.DataBean dataBean){
        mSearchView.searchSuccess(dataBean);
    }

    public void searchFailed(String message){
        Log.d("SearchPresenter","SearchFailed "+message);
    }

    public void search(String keyWord){
        search(keyWord,"normal");
    }

    public void search(String keyWord,String type){
        mModel.search(keyWord,type);
    }
}
