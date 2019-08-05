package top.bilibililike.ddplayer.widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.DDPlayer;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.utils.AppBarStateChangeListener;
import top.bilibililike.ddplayer.utils.ViewPagerAdapter;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvCommentFragment;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvIntroductionFragment;

public class PlayAvActivity extends BaseActivity {

    @BindView(R.id.player)
    ImageView player;
    @BindView(R.id.tx_title)
    TextView txTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.danmu_view)
    TextView danmuView;
    @BindView(R.id.appbar_layout)
    AppBarLayout appbarLayout;
    @BindView(R.id.view_pager)
    ViewPager viewpager;

    List<BaseFragment> fragmentList ;


    DDPlayer ddPlayer;
    @Override
    public int getLayoutId() {
        return R.layout.activity_play_av;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initBasicView();
        initFragmentAndViewPager();
        initTabLayout();

    }

    private void initBasicView() {

        boolean isStop = false;
        collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        appbarLayout = findViewById(R.id.appbar_layout);
        appbarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                if (state == State.EXPANDED) {
                    //展开状态
                    txTitle.setVisibility(View.GONE);
                    player.setVisibility(View.VISIBLE);

                } else if (state == State.COLLAPSED) {
                    //折叠状态
                    txTitle.setVisibility(View.VISIBLE);
                    player.setVisibility(View.INVISIBLE);

                } else {
                    //中间状态
                    player.setVisibility(View.VISIBLE);
                    txTitle.setVisibility(View.INVISIBLE);
                }
            }
        });

        /*TextView tvSwitch = findViewById(R.id.tv_switch);


        AppBarLayout.LayoutParams params = (AppBarLayout.LayoutParams) collapsingToolbarLayout.getLayoutParams();*/
        /*
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

         */




        /*tvSwitch.setOnClickListener(view -> {
            if (isStop){
                params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
            }else {
                params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL| AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
            }
            collapsingToolbarLayout.setLayoutParams(params);
            isStop = !isStop;

        });*/
    }

    private void initFragmentAndViewPager(){
        if (fragmentList == null){
            fragmentList = new ArrayList<>();
        }else {
            fragmentList.clear();
        }
        fragmentList.add(new AvIntroductionFragment());
        fragmentList.add(new AvCommentFragment());
        viewpager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList));



    }

    private void initTabLayout(){
        tabLayout.setupWithViewPager(viewpager);
        tabLayout.removeAllTabs();
        tabLayout.addTab(tabLayout.newTab().setText("简介"));
        tabLayout.addTab(tabLayout.newTab().setText("评论"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }




}
