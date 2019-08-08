package top.bilibililike.ddplayer.mvp.playAV;

import top.bilibililike.ddplayer.entity.AVDetailBean;
import top.bilibililike.ddplayer.entity.AVUrlBean;

public class PlayAVPresenter {
    private IPlayAVModel mModel;
    private IPlayAVView mView;
    public PlayAVPresenter(IPlayAVView view){
        this.mView = view;
        mModel = new PlayAVModel(this);
    }



    public void getAvDetailData(String aid){
        mModel.getAVDetailData(aid);
    }

    public void getAVDetailSuccess(AVDetailBean.DataBean dataBean){
        mView.getAVDetailSuccess(dataBean);
    }

    public void getAVDetailFailed(String message){
        mView.getAVDetailFailed(message);
    }

    public void getAVUrlSuccess(AVUrlBean.DataBean dataBean){
        mView.getAVUrlSuccess(dataBean);
    }

    public void getAVUrlFailed(String message){
        mView.getAVUrlFailed(message);
    }





}
