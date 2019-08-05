package top.bilibililike.ddplayer.widgets;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.customedView.NotMoveViewPager;
import top.bilibililike.ddplayer.entity.TokenBean;
import top.bilibililike.ddplayer.mvp.userInfo.IUserInfoView;
import top.bilibililike.ddplayer.entity.UserInfoBean;
import top.bilibililike.ddplayer.mvp.userInfo.UserInfoPresenter;
import top.bilibililike.ddplayer.utils.AppBarStateChangeListener;
import top.bilibililike.ddplayer.utils.GradientPageTransformer;
import top.bilibililike.ddplayer.utils.ViewPagerAdapter;
import top.bilibililike.ddplayer.utils.statusBar.StatusBarUtil;
import top.bilibililike.ddplayer.widgets.fragments.ChannelFragment;
import top.bilibililike.ddplayer.widgets.fragments.DynamicFragment;
import top.bilibililike.ddplayer.widgets.fragments.MallFragment;
import top.bilibililike.ddplayer.widgets.fragments.home.HomeFragment;

import static top.bilibililike.ddplayer.utils.StatusCode.EVENT_DEFAULT;
import static top.bilibililike.ddplayer.utils.StatusCode.EVENT_LOGIN;

public class MainActivity extends BaseActivity implements IUserInfoView {

    @BindView(R.id.container)
    NotMoveViewPager container;
    @BindView(R.id.bottom_nav)
    BottomNavigationView bottomNav;
    @BindView(R.id.main_nav_view)
    NavigationView mainNavView;
    @BindView(R.id.main_drawer_layout)
    DrawerLayout mainDrawerLayout;

    @BindView(R.id.appbar_layout)
    AppBarLayout appbarLayout;

    ImageView avatarIv;
    TextView nickNameTv;
    TextView coinTv;


    List<BaseFragment> fragmentList;
    UserInfoBean.DataBean infoBean;

    TokenBean.DataBean.TokenInfoBean tokenBean;


    @BindView(R.id.imv_drawer_switch)
    ImageView imvDrawerSwitch;
    @BindView(R.id.imv_avatar)
    CircleImageView imvAvatar;
    @BindView(R.id.imv_search)
    ImageView imvSearch;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.imv_ic1)
    ImageView imvIc1;
    @BindView(R.id.imv_ic2)
    ImageView imvIc2;
    @BindView(R.id.imv_ic3)
    ImageView imvIc3;
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;

    UserInfoPresenter presenter;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //状态栏
        initStatus();
        //初始化fragment和Viewpager
        initViewPager();
        //底部导航栏
        initBottomNav();
        //侧边的NavigationView
        initSlideNav();
        //初始化toolbar 参数是fragment的下标
        initToolbar();

        initData();

    }

    private void initFragments() {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
            fragmentList.add(new HomeFragment());
            fragmentList.add(new ChannelFragment());
            fragmentList.add(new DynamicFragment());
            fragmentList.add(new MallFragment());
            container.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList));
        }
    }

    private void refreshFragmentsData() {
        for (int i = 0; i < fragmentList.size(); i++) {
            fragmentList.get(i).notifyDataSetChanged();
        }
    }

    private void initViewPager() {
        initFragments();
        container.setNoScroll(true);
        container.setOffscreenPageLimit(4);
        container.setPageTransformer(true, new GradientPageTransformer());

        container.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNav.setSelectedItemId(R.id.nav_home);
                        break;
                    case 1:
                        bottomNav.setSelectedItemId(R.id.nav_channel);
                        break;
                    case 2:
                        bottomNav.setSelectedItemId(R.id.nav_dynamic);
                        break;
                    case 3:
                        bottomNav.setSelectedItemId(R.id.nav_mall);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initBottomNav() {
        bottomNav.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    container.setCurrentItem(0, false);
                    setToolbar(0);
                    break;
                case R.id.nav_channel:
                    container.setCurrentItem(1, false);
                    setToolbar(1);
                    break;
                case R.id.nav_dynamic:
                    container.setCurrentItem(2, false);
                    setToolbar(2);
                    break;
                case R.id.nav_mall:
                    container.setCurrentItem(3, false);
                    setToolbar(3);
            }


            return true;
        });
        bottomNav.setOnNavigationItemReselectedListener(menuItem -> {
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_gradient_transform);
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    fragmentList.get(0).notifyDataSetChanged();
                    container.startAnimation(animation);
                    break;
                case R.id.nav_channel:
                    fragmentList.get(1).notifyDataSetChanged();
                    container.startAnimation(animation);
                    break;
                case R.id.nav_dynamic:
                    fragmentList.get(2).notifyDataSetChanged();
                    container.startAnimation(animation);
                    break;
                case R.id.nav_mall:
                    fragmentList.get(3).notifyDataSetChanged();
                    container.startAnimation(animation);
                    break;
            }
        });
    }

    private void initStatus() {
        //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding
        StatusBarUtil.setRootViewFitsSystemWindows(this, false);
        //设置状态栏透明
        StatusBarUtil.setTranslucentStatus(this);
        //一般的手机的状态栏文字和图标都是白色的, 可如果你的应用也是纯白色的, 或导致状态栏文字看不清
        //所以如果你是这种情况,请使用以下代码, 设置状态使用深色文字图标风格, 否则你可以选择性注释掉这个if内容
        // if (!StatusBarUtil.setStatusBarDarkTheme(this, true)) {
        //如果不支持设置深色风格 为了兼容总不能让状态栏白白的看不清, 于是设置一个状态栏颜色为半透明,
        //这样半透明+白=灰, 状态栏的文字能看得清
        //  StatusBarUtil.setStatusBarColor(this,0x55000000);
        //    }

        /* *//*
            在布局顶部有一个高度为0 的View  background设置的是 和 toolbar 一样的颜色
            通过appbar的折叠状态监听 调整这个View 的 高度 实现透明状态栏
            TODO： 现在会有一种突兀感  后期加上动画效果应该好点
         *//*
        View view = findViewById(R.id.status_Bar);
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int StatusBarHeight = StatusBarUtil.getStatusBarHeight(this);
        params.height = StatusBarHeight;
        view.setLayoutParams(params);


        appbarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {

                if (state == State.EXPANDED) {
                    //展开状态
                    params.height = 1;
                    view.setLayoutParams(params);
                } else if (state == State.COLLAPSED) {
                    //折叠状态
                    params.height = StatusBarHeight;
                    view.setLayoutParams(params);
                } else {
                    //中间状态
                    params.height = StatusBarHeight;
                    view.setLayoutParams(params);
                }

            }
        });*/


    }

    private void initSlideNav() {
        View view = mainNavView.getHeaderView(0);
        avatarIv = view.findViewById(R.id.iv_avatar);
        nickNameTv = view.findViewById(R.id.tv_nickname);
        coinTv = view.findViewById(R.id.tv_coins);

        avatarIv.setOnClickListener(view1 -> {
            if (infoBean == null || tokenBean == null) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            } else {
                startActivity(new Intent(MainActivity.this, UserDetailActivity.class));
            }

        });

        nickNameTv.setOnClickListener(view2 -> {
            if (infoBean == null || tokenBean == null) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            } else {
                startActivity(new Intent(MainActivity.this, UserDetailActivity.class));
            }
        });
    }


    private void initToolbar() {
        /*View toolbar = findViewById(R.id.toolbar);
        AppBarLayout.LayoutParams params = (AppBarLayout.LayoutParams) toolbar.getLayoutParams();
        params.topMargin = StatusBarUtil.getStatusBarHeight(this);
        toolbar.setLayoutParams(params);*/
        setToolbar(0);
        imvDrawerSwitch.setOnClickListener(v -> {
            if (!mainDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                mainDrawerLayout.openDrawer(Gravity.LEFT);
            }

        });
    }

    private void initData() {
        presenter = new UserInfoPresenter(this);
        try {
            this.tokenBean = LitePal.find(TokenBean.DataBean.TokenInfoBean.class, 1);
            this.infoBean = LitePal.find(UserInfoBean.DataBean.class, 1);
        } catch (Exception ignored) {

        }
        if (tokenBean != null && infoBean != null && infoBean.getName() != null) {
            loadData();
            Log.d("MainActivity ", "加载老数据");

        }
        if (tokenBean != null && tokenBean.getAccess_token() != null) {
            presenter.loadUserInfo();
            Log.d("MainActivity ", "加载新数据");
        }
    }

    private void setToolbar(int position) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_gradient_transform);
        if (position == 0) {
            //首页
            imvIc1.setVisibility(View.VISIBLE);
            imvIc2.setVisibility(View.VISIBLE);
            imvIc3.setVisibility(View.VISIBLE);
            tvTitle.setVisibility(View.INVISIBLE);
            imvSearch.setVisibility(View.VISIBLE);
        } else if (position == 1) {
            //频道
            imvSearch.setVisibility(View.INVISIBLE);
            imvIc1.setVisibility(View.INVISIBLE);
            imvIc2.setVisibility(View.VISIBLE);
            imvIc3.setVisibility(View.VISIBLE);
            tvTitle.setVisibility(View.VISIBLE);
            tvTitle.setText("频道");
            tvTitle.startAnimation(animation);
            //todo 加上资源文件
            // imvIc2.setImageDrawable();
            // imvIc3.setImageDrawable();

        } else if (position == 2) {
            //动态
            imvSearch.setVisibility(View.INVISIBLE);
            imvIc1.setVisibility(View.INVISIBLE);
            imvIc2.setVisibility(View.INVISIBLE);
            imvIc3.setVisibility(View.VISIBLE);
            tvTitle.setVisibility(View.VISIBLE);
            tvTitle.setText("动态");
            tvTitle.startAnimation(animation);
            //todo 加上资源文件
            // imvIc3.setImageDrawable();
        } else if (position == 3) {
            //会员购
            imvSearch.setVisibility(View.INVISIBLE);
            imvIc1.setVisibility(View.INVISIBLE);
            imvIc2.setVisibility(View.VISIBLE);
            imvIc3.setVisibility(View.VISIBLE);
            tvTitle.setVisibility(View.VISIBLE);
            tvTitle.setText("频道");
            tvTitle.startAnimation(animation);
            //todo 加上资源文件
            // imvIc2.setImageDrawable();
            // imvIc3.setImageDrawable();
        }
    }


    private void loadData() {

        Glide.with(this)
                .load(infoBean.getFace())
                .into(imvAvatar);
        Glide.with(this)
                .load(infoBean.getFace())
                .into(avatarIv);
        nickNameTv.setText(infoBean.getName());
        int bCoin = infoBean.getBcoin();
        double coin = infoBean.getCoin();
        coinTv.setText("B币：" + bCoin + " 硬币：" + coin);

    }


    @Override
    public void updateUserInfoSuccess() {
        this.infoBean = LitePal.find(UserInfoBean.DataBean.class, 1);
        loadData();
    }

    @Override
    public void updateUserInfoFailed(String arg) {
        Toast.makeText(this, arg, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onBackPressed() {
        //抽屉打开就不返回
        if (mainDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
            mainDrawerLayout.closeDrawer(Gravity.LEFT);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //启动方式为 singleTask 的Activity 这个方法会自动cancel 所以说 没啥用 留着长记性
        Toast.makeText(this, requestCode, Toast.LENGTH_SHORT).show();
        if (requestCode == EVENT_LOGIN) {

            Toast.makeText(this, "EVENT_LOGIN Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "EVENT_LOGIN failed", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        int event = intent.getIntExtra("EVENT",EVENT_DEFAULT);
        if (event == EVENT_LOGIN){
            mainDrawerLayout.closeDrawer(Gravity.LEFT);
            refreshFragmentsData();
           initData();
        }
    }
}



