package top.bilibililike.ddplayer.widgets.fragments.home;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.utils.groceries.ViewPagerAdapter;
import top.bilibililike.ddplayer.widgets.fragments.home.bangumi.HomeBangumiFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.hot.HomeHotFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.live.HomeLiveFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.recommend.HomeRecommendFragment;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.appbar_layout)
    AppBarLayout appbarLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;

    private List<BaseFragment> fragmentList;

    @Override
    public void finishCreateView(Bundle state) {
        initFragments();
        initViewPager();
        initTabLayout();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

}

    private void initFragments(){
        if (fragmentList == null){
            fragmentList = new ArrayList<>();
            fragmentList.add(new HomeLiveFragment());
            fragmentList.add(new HomeRecommendFragment());
            fragmentList.add(new HomeHotFragment());
            fragmentList.add(new HomeBangumiFragment());
        }
    }

    private void initViewPager(){
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager(),fragmentList));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position);
                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initTabLayout(){
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.removeAllTabs();
        tabLayout.addTab(tabLayout.newTab().setText("直播"));
        tabLayout.addTab(tabLayout.newTab().setText("推荐"));
        tabLayout.addTab(tabLayout.newTab().setText("热门"));
        tabLayout.addTab(tabLayout.newTab().setText("追番"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                //todo 二次点击 刷新recyclerview
            }
        });
    }







}
