package top.bilibililike.ddplayer.widgets.fragments.home.live;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.adapter.BigoLiveRecyAdapter;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;
import top.bilibililike.ddplayer.mvp.bigoLive.BigoPresenter;
import top.bilibililike.ddplayer.mvp.bigoLive.IBigoView;
import top.bilibililike.ddplayer.widgets.playerActivities.PlayBigoLiveActivity;

public class HomeLiveFragment extends BaseFragment implements IBigoView,BigoLiveRecyAdapter.onClickListener {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh_layout)
    SmartRefreshLayout refreshLayout;

    private List<String> roomIDList;
    private List<BigoLiveBean> useFulList;
    private int addedItem;
    private BigoPresenter mPresenter;
    private BigoLiveRecyAdapter mAdapter;

    @Override
    public void finishCreateView(Bundle state) {
        if (roomIDList == null) {
            roomIDList = new ArrayList<>();
            roomIDList.add("302006359");//杏子凛

            roomIDList.add("301983029");//三峡莓大福 随缘转

            roomIDList.add("314164462");//物述有栖 字幕组转播Man
            roomIDList.add("314809996");// 安土桃的摸鱼搬运
            roomIDList.add("311234896");//熊猫人的搬运
            roomIDList.add("314024456");//Kronicle09不知道转谁的
            roomIDList.add("Troogle");//Meaqua Troogle每次都搬

            roomIDList.add("302045278");//彩虹社的转播（社畜）
            roomIDList.add("302203804");//id张金华 狗狗的转播Man



        }

        initRecyclerView();
        initData();
    }


    private void initRecyclerView() {
        if (mAdapter == null) {
            mAdapter = new BigoLiveRecyAdapter(getActivity(), null);
        }
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                useFulList.clear();
                loadData(true);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
    }

    private void initData() {
        if (useFulList == null) {
            useFulList = new ArrayList<>();
        }
        mPresenter = new BigoPresenter(this);
        loadData(false);
    }

    private void loadData(boolean isRefresh) {
        mPresenter.getDataList(roomIDList, isRefresh);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_home_recommend;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

    }


    @Override
    public void onDestroy() {
        mAdapter.unBind();
        super.onDestroy();
    }

    @Override
    public void getDataListSuccess(BigoLiveBean bigoBean, boolean isRefresh) {
        boolean isFinish = false;
        if (isRefresh && addedItem == roomIDList.size()) {
            Toast.makeText(getActivity(),"全部加载完毕",Toast.LENGTH_SHORT).show();
            addedItem = 0;
            isFinish  =true;
            refreshLayout.finishRefresh(true);
        }
        addedItem++;

            if ((bigoBean.getVideoSrc() == null) || (bigoBean.getVideoSrc().equals(""))) {

            } else {
                this.useFulList.add(bigoBean);
            }
        mAdapter.notifyDataSetChange(this.useFulList,isFinish);
    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(getActivity(), PlayBigoLiveActivity.class);
        intent.putExtra("url",useFulList.get(position).getVideoSrc());
        startActivity(intent);
    }
}
