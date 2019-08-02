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
        mModel.getData(isRefresh);
    }

    public void loadListSuccess(T bean,boolean isRefresh){
        if (bean instanceof List){
            mView.getDataSuccess(bean,isRefresh);
        }else loadListFailed("bean不是ItemBean");
    }

    public void loadListFailed(String arg){
        mView.getDataFailed(arg);
    }




}
