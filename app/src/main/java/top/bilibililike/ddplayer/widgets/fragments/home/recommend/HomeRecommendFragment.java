package top.bilibililike.ddplayer.widgets.fragments.home.recommend;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
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

    List<AvListBean.DataBean.ItemsBean> itemsBeans;
    HomeRecommendRecyAdapter adapter;
    RecommendPresenter<AvListBean> presenter;

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

       /* refreshLayout.setOnLoadMoreListener(refreshLayout -> {

            Toast.makeText(getContext(),"refreshLayout 加载更多了",Toast.LENGTH_SHORT).show();
            //todo logic of loadMore
        });*/

        adapter.setMoreListener(new BaseRecycleViewAdapter.AutoMoreListener() {
            @Override
            public void load() {
                Toast.makeText(getContext(),"adapter 加载更多了",Toast.LENGTH_SHORT).show();
                presenter.loadData(false);
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
    public void getDataSuccess(Object bean,boolean isRefresh) {
        if (bean instanceof List){
            Log.d("HomeRecommendFramgent","转系成功");
            this.itemsBeans = (List<AvListBean.DataBean.ItemsBean>) bean;
            List<AvListBean.DataBean.ItemsBean> deleteBean = new ArrayList<>();
            for (int i = 0; i < itemsBeans.size(); i++) {
                if (itemsBeans.get(i).getCard_goto() .equals("av")){

                }else {
                    deleteBean.add(itemsBeans.get(i));
                }
            }
            for (int i = 0; i < deleteBean.size(); i++) {
                itemsBeans.remove(deleteBean.get(i));
            }
            adapter.notifyDataChanged(itemsBeans,isRefresh);
        }
        Log.d("HomeRecommendFramgent","数据加载完成");
    }

    @Override
    public void getDataFailed(String arg) {
        Toast.makeText(getContext(), arg, Toast.LENGTH_SHORT).show();
    }
}
