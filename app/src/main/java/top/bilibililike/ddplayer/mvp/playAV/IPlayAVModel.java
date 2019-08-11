package top.bilibililike.ddplayer.mvp.playAV;

public interface IPlayAVModel {
    void getAVDetailData(String aid);

    void getAVComment();

    void getBangumiData(String season,int index);

    void getOverSeaBangumi(String season,int index);
}
