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
                loadData(true);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
    }

    private void initData() {
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
    public void getDataListSuccess(List<BigoLiveBean> bigoList, boolean isRefresh) {
        Toast.makeText(getActivity(),"拿到数据了",Toast.LENGTH_SHORT).show();
        if (isRefresh) {
            refreshLayout.finishRefresh(true);
        }
        List<BigoLiveBean> useFulBean = new ArrayList<>();
        for (BigoLiveBean bean : bigoList) {
            if ((bean.getVideoSrc() == null) || (bean.getVideoSrc().equals(""))) {

            } else {
                useFulBean.add(bean);
            }
        }
        Toast.makeText(getActivity(), "共收录 " + roomIDList.size() + " 位转播Man\n"
                        + "目前在线 " + useFulBean.size() + " 人"
                , Toast.LENGTH_SHORT).show();
        mAdapter.notifyDataSetChange(useFulBean);
        this.useFulList = useFulBean;
    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(getActivity(), PlayBigoLiveActivity.class);
        intent.putExtra("url",useFulList.get(position).getVideoSrc());
        startActivity(intent);
    }
}
