package top.bilibililike.ddplayer.mvp.playAV;

import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;

public interface IPlayAVView {
    String getAid();
    String getSeason();
    int getIndex();

    void getAVDetailSuccess(AVDetailBean.DataBean dataBean);
    void getAVDetailFailed(String message);
    void getAVUrlSuccess(AVUrlBean.DataBean dataBean);
    void getAVUrlFailed(String message);

    void getBangumiDetailSuccess(BangumiDetailBean.ResultBean dataBean);
    void getBangumiDetailFailed(String message);
    void getBangumiUrlSuccess(BangumiUrlBean.DashBean dataBean);
    void getBangumiUrlSuccess(BangumiUrlBean.DurlBean dataBean);
    void getBangumiUrlFailed(String message);

}
