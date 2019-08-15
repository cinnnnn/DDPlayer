package top.bilibililike.ddplayer.widgets.fragments.bangumi;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.utils.groceries.ViewPagerAdapter;
import top.bilibililike.ddplayer.widgets.fragments.home.bangumi.BangumiEndFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.bangumi.BangumiSeasonFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.bangumi.BangumiUpdatingFragment;

public class BangumiActivity extends BaseActivity {
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;

    List<BaseFragment> fragmentList ;

    @Override
    public int getLayoutId() {
        return R.layout.activity_bangumi;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initFragmentAndViewPager();
        initTabLayout();
    }


    private void initFragmentAndViewPager(){
        if (fragmentList == null) fragmentList = new ArrayList<>();
        fragmentList.clear();
        fragmentList.add(new BangumiSeasonFragment());
        fragmentList.add(new BangumiUpdatingFragment());
        fragmentList.add(new BangumiEndFragment());
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
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
        tabLayout.addTab(tabLayout.newTab().setText("分季列表"));
        tabLayout.addTab(tabLayout.newTab().setText("连载动画"));
        tabLayout.addTab(tabLayout.newTab().setText("完结动画"));

    }


}
