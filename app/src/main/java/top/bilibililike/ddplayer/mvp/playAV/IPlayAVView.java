package top.bilibililike.ddplayer.mvp.playAV;

import top.bilibililike.ddplayer.entity.AVDetailBean;
import top.bilibililike.ddplayer.entity.AVUrlBean;

public interface IPlayAVView {
    String getAid();

    void getAVDetailSuccess(AVDetailBean.DataBean dataBean);
    void getAVDetailFailed(String message);
    void getAVUrlSuccess(AVUrlBean.DataBean dataBean);
    void getAVUrlFailed(String message);

}
