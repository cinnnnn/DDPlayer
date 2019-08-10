package top.bilibililike.ddplayer.mvp.playAV;

import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;

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

    public void getBangumiDetailData(String season,int index){
        mModel.getBangumiData(season,index);
    }

    public void getAVDetailSuccess(AVDetailBean.DataBean dataBean){
        mView.getAVDetailSuccess(dataBean);
    }

    public void getAVDetailFailed(String message){
        mView.getAVDetailFailed(message);
        if (message.contains("sign") || message.contains("签名")){
            getAvDetailData(mView.getAid());
        }
    }

    public void getAVUrlSuccess(AVUrlBean.DataBean dataBean){
        mView.getAVUrlSuccess(dataBean);
    }

    public void getAVUrlFailed(String message){
        mView.getAVUrlFailed(message);
        if (message.contains("sign") || message.contains("签名")){
            getAvDetailData(mView.getAid());
        }

    }


    public void getBangumiDetailSuccess(BangumiDetailBean.ResultBean dataBean){
        mView.getBangumiDetailSuccess(dataBean);
    }

    public void getBangumiDetailFailed(String message){
        mView.getBangumiDetailFailed(message);
        if (message.contains("sign") || message.contains("签名")){
            getBangumiDetailData(mView.getSeason(),mView.getIndex());
        }
    }

    public void getBangumiUrlSuccess(BangumiUrlBean.DashBean dashBean){
        mView.getBangumiUrlSuccess(dashBean);
    }

    public void getBangumiUrlSuccess(BangumiUrlBean.DurlBean durlBean){
        mView.getBangumiUrlSuccess(durlBean);
    }

    public void getBangumiUrlFailed(String message){
        mView.getBangumiUrlFailed(message);
        if (message.contains("sign") || message.contains("签名")){
            getBangumiDetailData(mView.getSeason(),mView.getIndex());
        }
    }


}
