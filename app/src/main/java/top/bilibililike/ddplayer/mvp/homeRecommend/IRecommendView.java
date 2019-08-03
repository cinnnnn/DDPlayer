package top.bilibililike.ddplayer.mvp.homeRecommend;

public interface IRecommendView<T> {
    void getDataSuccess(T bean,boolean isRefresh);

    void getDataFailed(String arg);
    void getDataFailed();

}
