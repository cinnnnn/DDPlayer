package top.bilibililike.ddplayer.mvp.playAV;

public interface IPlayAVModel {
    void getAVDetailData(String aid);

    void getAVComment();

    void getBangumiData(String season,int index);
}
