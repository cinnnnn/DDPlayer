package top.bilibililike.ddplayer.mvp.bigoLive;

import java.util.List;

import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;

public interface IBigoView {
    void getDataListSuccess(BigoLiveBean bigoList,boolean isRefresh);

}
