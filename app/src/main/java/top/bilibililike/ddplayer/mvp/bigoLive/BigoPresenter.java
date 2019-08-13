package top.bilibililike.ddplayer.mvp.bigoLive;

import java.util.ArrayList;
import java.util.List;

import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;

public class BigoPresenter {
    private IBigoView mBigoView;
    private IBigoModel mBigoModel;
    private List<String> urlList;
    private List<BigoLiveBean> bigoList;
    public BigoPresenter(IBigoView bigoView){
        this.mBigoView = bigoView;
        this.mBigoModel = new BigoModel(this);
    }
    public void getDataList(List<String> urlList){
        getDataList(urlList,false);
    }

    public void getDataList(List<String> urlList,boolean isRefresh){
        this.urlList = urlList;
        for (int i = 0; i < urlList.size(); i++) {
            mBigoModel.getBigoLiveData(urlList.get(i),isRefresh);
        }
    }

    public void getDataSuccess(BigoLiveBean liveBean,boolean isRefresh){
        System.out.println(Thread.currentThread());
        if (bigoList != null ){
            bigoList.add(liveBean);
        }else {
            bigoList = new ArrayList<>();
            bigoList.add(liveBean);
        }
        if (bigoList.size() == urlList.size()){
            mBigoView.getDataListSuccess(bigoList,isRefresh);
        }
    }

    public void getDataFailed(){

    }


}
