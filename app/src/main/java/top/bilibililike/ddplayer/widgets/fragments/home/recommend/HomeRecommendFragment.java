package top.bilibililike.ddplayer.widgets.fragments.home.recommend;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.adapter.HomeRecommendRecyAdapter;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.base.BaseRecycleViewAdapter;
import top.bilibililike.ddplayer.entity.AvListBean;
import top.bilibililike.ddplayer.mvp.homeRecommend.IRecommendView;
import top.bilibililike.ddplayer.mvp.homeRecommend.RecommendPresenter;
import top.bilibililike.ddplayer.widgets.playerActivities.PlayAvActivity;


public class HomeRecommendFragment extends BaseFragment implements IRecommendView {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh_layout)
    SmartRefreshLayout refreshLayout;

    private HomeRecommendRecyAdapter adapter;
    private RecommendPresenter<AvListBean> presenter;
    private List<AvListBean.DataBean.ItemsBean> beanList;

    @Override
    public void finishCreateView(Bundle state) {
        initRecyclerView();
        loadData(false);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_home_recommend;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {
        loadData(true);
    }


    private void initRecyclerView(){
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        adapter = new HomeRecommendRecyAdapter(this.getActivity(), null);

        recyclerView.setAdapter(adapter);


        refreshLayout.setOnRefreshListener(refreshLayout -> {
            presenter.loadData(true);
        });

        refreshLayout.setOnLoadMoreListener(refreshLayout -> {
             presenter.loadData(false);
        });

        adapter.setOnItemClickListener(new BaseRecycleViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, Object entity) {
                AvListBean.DataBean.ItemsBean itemBean = (AvListBean.DataBean.ItemsBean) entity;
                Intent intent = new Intent(getActivity(), PlayAvActivity.class);
                intent.putExtra("av",itemBean.getArgs().getAid());
                startActivity(intent);

            }
        });




    }

    private void loadData(boolean isRefresh){
        if (presenter == null){
            presenter = new RecommendPresenter<>(this);
        }
        presenter.loadData(isRefresh);
    }


    @Override
    public void getDataSuccess(Object beanList,boolean isRefresh) {
        if (beanList instanceof List){
            this.beanList = new ArrayList<>();
            for (AvListBean.DataBean.ItemsBean item:(List<AvListBean.DataBean.ItemsBean>)beanList
                 ) {
                if (item.getCard_goto().equals("av")){
                    this.beanList.add(item);
                }
            }
            adapter.notifyDataChanged(this.beanList,isRefresh);

        }
        if (isRefresh){
            refreshLayout.finishRefresh();
        }else {
            refreshLayout.finishLoadMore();
        }
        Log.d("HomeRecommendFragment","数据加载完成");
    }

    @Override
    public void getDataFailed(String arg) {
        Log.d("HomeRecommendFragment","getDataFailed "+arg);
        Toast.makeText(getContext(), arg, Toast.LENGTH_SHORT).show();
        refreshLayout.finishRefresh();
    }

    @Override
    public void getDataFailed() {
        Log.d("HomeRecommendFragment","getDataFailed "+"请求列表失败");
    }
}
