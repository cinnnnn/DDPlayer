package top.bilibililike.ddplayer.mvp.homeRecommend;

import java.util.List;

import top.bilibililike.ddplayer.entity.AvListBean;

public class RecommendPresenter<T> {
    private IRecommendView mView;
    private IRecommendModel mModel;
    public RecommendPresenter(IRecommendView view){
        this.mView = view;
        mModel = new RecommendModel(this);
    }

    public void loadData(boolean isRefresh){
        mModel.getAvData(isRefresh);
    }

    public void loadListSuccess(T beanList,boolean isRefresh){
        if (beanList instanceof List){

            mView.getDataSuccess(beanList,isRefresh);
        }else loadListFailed("bean不是ItemList");
    }

    public void loadListFailed(String arg){
        mView.getDataFailed(arg);
    }

    public void loadListFailed(){
        mView.getDataFailed();
    }



}
