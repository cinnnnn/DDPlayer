package top.bilibililike.ddplayer.widgets.fragments.home.recommend;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.base.BaseRecycleViewAdapter;
import top.bilibililike.ddplayer.entity.AvListBean;
import top.bilibililike.ddplayer.mvp.homeRecommend.IRecommendView;
import top.bilibililike.ddplayer.mvp.homeRecommend.RecommendPresenter;


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
    public void notifyDataSetChanged() {
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
        Toast.makeText(getContext(), arg, Toast.LENGTH_SHORT).show();
        refreshLayout.finishRefresh();
    }

    @Override
    public void getDataFailed() {
        Toast.makeText(getContext(), "请求列表失败", Toast.LENGTH_SHORT).show();
    }
}
