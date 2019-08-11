package top.bilibililike.ddplayer.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.adapter.SelectRecyAdapter;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;

public class SelectBangumiActivity extends BaseActivity implements SelectRecyAdapter.onClickListener {

    @BindView(R.id.imv_back)
    ImageView imvBack;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    SelectRecyAdapter mAdapter;
    List dataList;
    int season;
    @BindView(R.id.tv_title)
    TextView tvTitle;


    @Override
    public int getLayoutId() {
        return R.layout.activity_select_bangumi;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initData();
        imvBack.setOnClickListener(v -> onBackPressed());

    }

    private void initData() {
        Bundle bundle = getIntent().getBundleExtra("bundle");

        if (bundle != null) {
            season = bundle.getInt("season");
            String title = bundle.getString("title");
            tvTitle.setText(title);
            List<SearchBangumiBean.DataBean.ItemsBean.EpisodesBean> episodeList = bundle.getParcelableArrayList("episodeList");
            List<SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean> episodeNewList = bundle.getParcelableArrayList("episodeNewList");
            if (episodeList != null) {
                dataList = episodeList;
                initRecyclerView(episodeList);
            } else if (episodeNewList != null) {
                dataList = episodeNewList;
                initRecyclerView(episodeNewList);
            } else {
                Toast.makeText(this, "全null了", Toast.LENGTH_SHORT).show();
                Log.d("SelectActivity", "list 全 NUll 了");
            }
        } else {
            Toast.makeText(this, "BundleNull了", Toast.LENGTH_SHORT).show();
            Log.d("SelectActivity", "bundle NUll 了");
        }
    }

    private void initRecyclerView(List dataList) {
        mAdapter = new SelectRecyAdapter(this, dataList);
        mAdapter.setOnClickListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(mAdapter);
    }


    @Override
    public void onClick(String title) {
        List<SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean> episodesNewBeanList = null;
        List<SearchBangumiBean.DataBean.ItemsBean.EpisodesBean> episodesBeanList = null;
        if (dataList.get(0) instanceof SearchBangumiBean.DataBean.ItemsBean.EpisodesBean) {
            episodesBeanList = dataList;
        } else if (dataList.get(0) instanceof SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean) {
            episodesNewBeanList = dataList;
        }
        if (episodesBeanList != null) {
            for (SearchBangumiBean.DataBean.ItemsBean.EpisodesBean bean : episodesBeanList) {
                if (bean.getIndex().equals(title)) {
                    Intent intent = new Intent(SelectBangumiActivity.this, PlayAvActivity.class);
                    intent.putExtra("season", season);
                    intent.putExtra("index", Integer.valueOf(bean.getIndex()));
                    startActivity(intent);
                }
            }
        } else if (episodesNewBeanList != null) {
            for (SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean bean : episodesNewBeanList) {
                if (bean.getTitle().equals(title)) {
                    Intent intent = new Intent(SelectBangumiActivity.this, PlayAvActivity.class);
                    intent.putExtra("season", season);
                    intent.putExtra("index", Integer.valueOf(bean.getTitle()));
                    startActivity(intent);
                }
            }
        }
    }
}
