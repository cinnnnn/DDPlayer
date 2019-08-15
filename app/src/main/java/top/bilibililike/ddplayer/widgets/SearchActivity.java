package top.bilibililike.ddplayer.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.adapter.SearchRecyAdapter;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;
import top.bilibililike.ddplayer.mvp.search.ISearchView;
import top.bilibililike.ddplayer.mvp.search.SearchPresenter;
import top.bilibililike.ddplayer.widgets.playerActivities.PlayAvActivity;

public class SearchActivity extends BaseActivity implements ISearchView,SearchRecyAdapter.OnItemClickedListener {


    @BindView(R.id.search_edtv)
    EditText searchEdtv;
    @BindView(R.id.txv_search)
    TextView txvSearch;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    SearchRecyAdapter mAdapter;

    SearchPresenter mPresenter;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
   // @BindView(R.id.view_pager)
   // ViewPager viewPager;

    @Override
    public int getLayoutId() {
        return R.layout.activity_search;

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        mPresenter = new SearchPresenter(this);
        initRecyclerView();
        initViewPager();
        initTabLayout();
        txvSearch.setOnClickListener(v -> {
            if (tabLayout.getSelectedTabPosition() == 0){
                mPresenter.search(searchEdtv.getText().toString());
            }else if (tabLayout.getSelectedTabPosition() == 1){
                mPresenter.search(searchEdtv.getText().toString(),"bangumi");
            }else if (tabLayout.getSelectedTabPosition() == 2){
                mPresenter.search(searchEdtv.getText().toString(),"live");
            }
        });
    }

    private void initRecyclerView() {

        mAdapter = new SearchRecyAdapter(this, null,"normal");
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.setClickListener(this);
    }

    private void initTabLayout(){
        tabLayout.addTab(tabLayout.newTab().setText("综合"));
        tabLayout.addTab(tabLayout.newTab().setText("番剧"));
        tabLayout.addTab(tabLayout.newTab().setText("直播"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0){
                    mPresenter.search(searchEdtv.getText().toString());
                }else if (tab.getPosition() == 1){
                    mPresenter.search(searchEdtv.getText().toString(),"bangumi");
                }else if (tab.getPosition() == 2){
                    mPresenter.search(searchEdtv.getText().toString(),"live");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initViewPager(){

    }

    @Override
    public void searchSuccess(SearchBean.DataBean dataBean) {
        Log.d("SearchActivity", "searchSuccessNormal");
        mAdapter = new SearchRecyAdapter(this,mAdapter.getDataList(),"normal");
        mAdapter.setClickListener(this);
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChange(dataBean.getItem(), "normal");
    }

    @Override
    public void searchSuccess(SearchBangumiBean.DataBean dataBean) {
        Log.d("SearchActivity", "searchSuccessBangumi");
        mAdapter = new SearchRecyAdapter(this,mAdapter.getDataList(),"bangumi");
        mAdapter.setClickListener(this);
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChange(dataBean.getItems(), "bangumi");
    }

    @Override
    public void searchSuccess(SearchLiveBean.DataBean dataBean) {
        Log.d("SearchActivity", "searchSuccessLive");
        mAdapter = new SearchRecyAdapter(this,mAdapter.getDataList(),"live");
        mAdapter.setClickListener(this);
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChange(dataBean.getLive_room().getItems(), "live");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mAdapter != null && mAdapter.unbinder != null) {
            mAdapter.unbinder.unbind();
        }
    }

    @Override
    public void onClick(Object dataBean, String type) {
        if (type.equals("normal")){
            SearchBean.DataBean.ItemBean itemBean = (SearchBean.DataBean.ItemBean) dataBean;
            Intent intent = new Intent(SearchActivity.this,PlayAvActivity.class);
            intent.putExtra("av",Integer.valueOf(itemBean.getParam()));
            Log.d("SearchActivity","av 应该是"+itemBean.getParam());
            startActivity(intent);
        }else if (type.equals("bangumi")){
            SearchBangumiBean.DataBean.ItemsBean itemsBean = (SearchBangumiBean.DataBean.ItemsBean) dataBean;
            Intent intent = new Intent(SearchActivity.this,PlayAvActivity.class);
            intent.putExtra("season",itemsBean.getSeason_id());
            startActivity(intent);
        }else if (type.equals("live")){
            SearchLiveBean.DataBean.LiveRoomBean.ItemsBean itemsBean = (SearchLiveBean.DataBean.LiveRoomBean.ItemsBean) dataBean;
        }
        Log.d("SearchActivity","type = "+type);
    }

    @Override
    public void onClick(View tempView, Object dataBean, String type) {
        TextView textView = null;
        SearchBangumiBean.DataBean.ItemsBean itemsBean = (SearchBangumiBean.DataBean.ItemsBean) dataBean;
        List<SearchBangumiBean.DataBean.ItemsBean.EpisodesBean> episodeList = itemsBean.getEpisodes();
        List<SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean> episodeNewList = itemsBean.getEpisodes_new();
        if (tempView instanceof TextView){
            textView = (TextView) tempView;
        }
        if (textView.getText().toString().equals("立即观看")){
            Intent intent = new Intent(SearchActivity.this, PlayAvActivity.class);
            intent.putExtra("season",episodeList.get(0).getParam());
            startActivity(intent);
        }else if (textView.getText().toString().equals("追番")){

        }
        if (episodeList != null){
            for (SearchBangumiBean.DataBean.ItemsBean.EpisodesBean e:episodeList) {
                if (textView.getText().toString().equals(e.getIndex())){
                    Intent intent = new Intent(SearchActivity.this,PlayAvActivity.class);
                    intent.putExtra("season",itemsBean.getSeason_id());
                    intent.putExtra("index",episodeList.indexOf(e));
                    startActivity(intent);
                    break;
                }
            }
        }else {
            for (SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean e:episodeNewList) {
                if (textView.getText().toString().equals(e.getTitle())){
                    Intent intent = new Intent(SearchActivity.this,PlayAvActivity.class);
                    intent.putExtra("season",itemsBean.getSeason_id());
                    intent.putExtra("index",episodeNewList.indexOf(e));
                    startActivity(intent);
                    break;
                }
            }
        }

        if (textView.getText().toString().equals("...")){
            Bundle bundle = new Bundle();
            ArrayList<SearchBangumiBean.DataBean.ItemsBean.EpisodesBean> episodesArrayList = new ArrayList<>(episodeList);
            ArrayList<SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean> episodesNewBeanArrayList = new ArrayList<>(episodeNewList);
            //todo 跳转到选集页面activity
            if (episodeList != null){
                bundle.putParcelableArrayList("episodeList",episodesArrayList);
            }else {
                bundle.putParcelableArrayList("episodeNewList",episodesNewBeanArrayList);
            }
            bundle.putInt("season",itemsBean.getSeason_id());
            bundle.putString("title",itemsBean.getTitle());
            Intent intent = new Intent(SearchActivity.this,SelectBangumiActivity.class);
            intent.putExtra("bundle",bundle);
            startActivity(intent);
        }
    }
}
