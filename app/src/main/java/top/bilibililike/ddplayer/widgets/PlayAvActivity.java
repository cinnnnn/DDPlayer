package top.bilibililike.ddplayer.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.customedView.videoView.CustomManager;
import top.bilibililike.ddplayer.customedView.videoView.MultiSampleVideo;
import top.bilibililike.ddplayer.entity.avPlay.AVDetailBean;
import top.bilibililike.ddplayer.entity.avPlay.AVUrlBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiDetailBean;
import top.bilibililike.ddplayer.entity.bangumiPlay.BangumiUrlBean;
import top.bilibililike.ddplayer.mvp.playAV.IPlayAVView;
import top.bilibililike.ddplayer.mvp.playAV.PlayAVPresenter;
import top.bilibililike.ddplayer.utils.AppBarStateChangeListener;
import top.bilibililike.ddplayer.utils.ViewPagerAdapter;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvCommentFragment;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvIntroductionFragment;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.BangumiIntroductionFragment;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_AUTO_COMPLETE;
import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_PAUSE;
import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_PLAYING;
import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_PLAYING_BUFFERING_START;

public class PlayAvActivity extends BaseActivity implements IPlayAVView {

    @BindView(R.id.av_player)
    MultiSampleVideo avPlayer;
    @BindView(R.id.tx_title)
    TextView txTitle;
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
    @BindView(R.id.audio_player)
    MultiSampleVideo audioPlayer;

    List<BaseFragment> fragmentList;
    private boolean isPlay = true;

    String aid;
    String season;
    int index;

    PlayAVPresenter mPresenter;
    GSYVideoViewBridge avManager;
    GSYVideoViewBridge audioManager;

    @Override
    protected void doBeforeSetContent() {
        //去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //隐藏顶部的状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.doBeforeSetContent();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_play_av;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent = getIntent();
        aid = intent.getIntExtra("av", 62693988) + "";
        season = intent.getIntExtra("season", 0) + "";
        index = intent.getIntExtra("index",0);
        initBasicView();
        initFragmentAndViewPager();
        initTabLayout();
        initPlayer();
        initData();
    }

    private void initBasicView() {
        appbarLayout = findViewById(R.id.appbar_layout);
        appbarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                if (state == State.EXPANDED) {
                    //展开状态
                    txTitle.setVisibility(View.GONE);
                    //avPlayer.setVisibility(View.VISIBLE);

                } else if (state == State.COLLAPSED) {
                    //折叠状态
                    txTitle.setVisibility(View.VISIBLE);
                    // avPlayer.setVisibility(View.INVISIBLE);

                } else {
                    //中间状态
                    // avPlayer.setVisibility(View.VISIBLE);
                    txTitle.setVisibility(View.INVISIBLE);
                }
            }
        });
        AppBarLayout.LayoutParams params = (AppBarLayout.LayoutParams) collapsingToolbar.getLayoutParams();
        if (avPlayer.getCurrentState() == CURRENT_STATE_PLAYING) {
            params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
        } else {
            params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL | AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
        }

        try {
            Observable.interval(500, 1000, TimeUnit.MILLISECONDS)
                    .takeWhile(bool -> isPlay)
                    .subscribeOn(AndroidSchedulers.mainThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<Long>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(Long aLong) {
                            if (avPlayer == null ){

                            } else  if (avPlayer.getCurrentState() == CURRENT_STATE_PLAYING) {
                                if (params.getScrollFlags() != AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED) {
                                    params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
                                    collapsingToolbar.setLayoutParams(params);
                                }
                            } else {
                                if (params.getScrollFlags() != (AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL | AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED)) {
                                    params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL | AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED);
                                    collapsingToolbar.setLayoutParams(params);
                                }
                            }
                        }

                        @Override
                        public void onError(Throwable e) {
                            e.printStackTrace();
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        /*
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;

         */


    }

    private void initFragmentAndViewPager() {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        } else {
            fragmentList.clear();
        }
        if (!season.equals("0")){
            fragmentList.add(new BangumiIntroductionFragment());
        }else {
            fragmentList.add(new AvIntroductionFragment());
        }

        fragmentList.add(new AvCommentFragment());
        viewpager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList));


    }

    private void initTabLayout() {
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

    private void initPlayer() {
        avPlayer.setTag("AV101");
        audioPlayer.setTag("audio");
        avPlayer.setPlayPosition(0);
        audioPlayer.setPlayPosition(1);
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Accept", "*/*");
        headerMap.put("User-Agent", "Bilibili Freedoooooom/MarkII");
        audioPlayer.setMapHeadData(headerMap);
        Map<String, String> avHeaderMap = new HashMap<>();
        avHeaderMap.put("Accept", "*/*");
        avHeaderMap.put("User-Agent", "Bilibili Freedoooooom/MarkII");
        //avHeaderMap.put("Range", "0-");
        avPlayer.setMapHeadData(avHeaderMap);
        avPlayer.setAutoFullWithSize(true);
        avPlayer.setShowFullAnimation(true);
        avManager = avPlayer.getGSYVideoManager();
        audioManager = audioPlayer.getGSYVideoManager();
        avPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //audioPlayer.startWindowFullscreen(PlayAvActivity.this,false,false);
                avPlayer.startWindowFullscreen(PlayAvActivity.this, false, false);
                avManager = avPlayer.getGSYVideoManager();
            }
        });
        avPlayer.getBackButton().setOnClickListener(view -> onBackPressed());
        if (avPlayer.isIfCurrentIsFullscreen()) {
            avPlayer.getFullWindowPlayer().getBackButton().setOnClickListener(v -> avManager = avPlayer.getGSYVideoManager());
        }

    }

    private void loadPlayer(String avUrl, String audioUrl) {
        // avUrl = "http://183.236.60.80:7793/wsconnect?2407526888&3451096147&7216&0";
        if (!audioUrl.equals("null")){
            audioPlayer.setUp(audioUrl, true, "音频测试");
            audioPlayer.setSpeed(1);
            audioPlayer.startAfterPrepared();
        }else {
            audioPlayer = null;
        }
        avPlayer.setSpeed(1);
        avPlayer.setUp(avUrl, true, "播放测试");

        avPlayer.startAfterPrepared();
        //ijk关闭log
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);
        try {
            if (avPlayer.isStartAfterPrepared() && audioPlayer!=null && audioPlayer.isStartAfterPrepared()) {
                Observable
                        .interval(3000, 300, TimeUnit.MILLISECONDS)
                        .takeWhile(aLong -> isPlay)
                        .takeWhile(aLong -> audioPlayer!=null)
                        .takeWhile(aLong -> avPlayer != null)
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnError(throwable -> Log.d("PlayavActivity 时间调节","翻车了"+throwable.toString()))
                        .subscribe(new Observer<Long>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(Long aLong) {
                                Log.d("PlayavActivity 时间调节","进入了");
                                long avCurrent = avManager.getCurrentPosition();
                                long audioCurrent = audioManager.getCurrentPosition();
                                Log.d("playav", "avManager current = " + avCurrent);
                                float temp;
                                if (Math.abs(audioCurrent - avCurrent) > 500 && avPlayer.getCurrentState() != CURRENT_STATE_AUTO_COMPLETE) {
                                    audioManager.seekTo(avCurrent);
                                    Log.d("Plav", "seek *1 " + audioCurrent + "\n " + avCurrent);

                                } else if ((temp = (audioCurrent - avCurrent)) < 200) {
                                    Log.d("Plav", "audio快了 " + audioPlayer.getCurrentTime() + "\n " + avCurrent);

                                    temp = Math.abs(temp / (200 + temp));
                                    temp = temp < 0.9f ? 0.9f : temp;
                                    avManager.setSpeed(temp, false);
                                } else if ((temp = (audioCurrent - avCurrent)) > -200) {
                                    Log.d("Plav", "av快了 " + audioCurrent + "\n " + avCurrent);

                                    temp = Math.abs(temp / (200 - temp));
                                    temp = temp > 1.1f ? temp : 1.1f;
                                    avManager.setSpeed(temp, false);
                                } else {
                                    avManager.setSpeed(1, false);
                                }
                                // todo fix 可能存在bug
                                if (avPlayer.getSeekTo() > 0) {
                                    audioManager.seekTo(avPlayer.getCurrentTime());
                                    avPlayer.setSeekTo(-1);
                                }

                                if (!avPlayer.isIfCurrentIsFullscreen()) {
                                    if (avPlayer.getCurrentState() == CURRENT_STATE_PAUSE || avPlayer.getCurrentState() == CURRENT_STATE_PLAYING_BUFFERING_START) {
                                        audioPlayer.onVideoPause();
                                    } else if (avPlayer.getCurrentState() == CURRENT_STATE_PLAYING) {

                                        if (audioPlayer.getCurrentState() == CURRENT_STATE_PAUSE) {
                                            audioPlayer.onVideoResume(true, avPlayer.getCurrentTime());
                                        } else if (audioPlayer.getCurrentState() == CURRENT_STATE_AUTO_COMPLETE && avPlayer.getCurrentTime() <= 5000) {
                                            audioPlayer.startLogic();
                                        }

                                    }
                                } else {
                                    if (avPlayer.getFullWindowPlayer().getCurrentState() == CURRENT_STATE_PAUSE || avPlayer.getFullWindowPlayer().getCurrentState() == CURRENT_STATE_PLAYING_BUFFERING_START) {
                                        audioPlayer.onVideoPause();
                                    } else if (avPlayer.getFullWindowPlayer().getCurrentState() == CURRENT_STATE_PLAYING) {

                                        if (audioPlayer.getCurrentState() == CURRENT_STATE_PAUSE) {
                                            audioPlayer.onVideoResume(true, avCurrent);
                                        } else if (audioPlayer.getCurrentState() == CURRENT_STATE_AUTO_COMPLETE && avCurrent <= 5000) {
                                            audioPlayer.startLogic();
                                        }

                                    }
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                e.printStackTrace();
                            }

                            @Override
                            public void onComplete() {

                            }
                        });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void loadPlayer(String avUrl){
        // avUrl = "http://183.236.60.80:7793/wsconnect?2407526888&3451096147&7216&0";
        avPlayer.setUp(avUrl, true, "播放测试");
        avPlayer.setSpeed(1);
        avPlayer.startAfterPrepared();
        //ijk关闭log
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);


    }

    private void initData() {
        mPresenter = new PlayAVPresenter(this);
        if (!season.equals("0")){
            mPresenter.getBangumiDetailData(season,index);
        }else {
            mPresenter.getAvDetailData(getAid());
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        CustomManager.onPauseAll();
    }

    @Override
    protected void onResume() {
        super.onResume();
        CustomManager.onResumeAll();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        isPlay = false;
        CustomManager.clearAllVideo();
    }


    @Override
    public String getAid() {
        if (aid == null) {
            Log.d("Playav", "aid null 了");
            aid = "61837347";
        }
        return aid;
    }

    @Override
    public String getSeason() {
        if (season == null) {
            Log.d("PlayBangumi", "season null 了");
            season = "61837347";
        }
        return season;
    }

    @Override
    public int getIndex() {
        if (season == null) {
            Log.d("PlayBangumi", "index null 了");
            index = 0;
        }
        return index;
    }


    @Override
    public void getAVDetailSuccess(AVDetailBean.DataBean dataBean) {
        Log.d("Playav AVDetailSuccess", dataBean.getTitle());
        avPlayer.loadCoverImage(dataBean.getPic(), R.mipmap.ic_22_hide);
        fragmentList.get(0).notifyDataSetChanged(dataBean);
    }

    @Override
    public void getAVDetailFailed(String message) {
        Log.d("Playav detailFailed", message);
    }

    @Override
    public void getAVUrlSuccess(AVUrlBean.DataBean dataBean) {
        if (dataBean.getDash() != null) {
            Log.d("Playav AVUrlSuccess", dataBean.getResult());
            List<AVUrlBean.DataBean.DashBean.VideoBean> dashList = dataBean.getDash().getVideo();
            AVUrlBean.DataBean.DashBean.VideoBean videoBean = dashList.get(0);
            for (AVUrlBean.DataBean.DashBean.VideoBean bean : dashList
            ) {
                if (bean.getId() == 32) videoBean = bean;
            }
            loadPlayer(videoBean.getBase_url(), dataBean.getDash().getAudio().get(0).getBase_url());

            fragmentList.get(1).notifyDataSetChanged(videoBean.getBase_url(), dataBean.getDash().getAudio().get(0).getBase_url());
            Log.d("Playav", videoBean.getBase_url());
        } else {
            loadPlayer(dataBean.getDurl().get(0).getUrl());
            Log.d("Playav", dataBean.getDurl().get(0).getUrl());
        }

    }

    @Override
    public void getAVUrlFailed(String message) {
        Log.d("Playav AVUrlFailed", message);
    }

    @Override
    public void getBangumiDetailSuccess(BangumiDetailBean.ResultBean dataBean) {
        avPlayer.loadCoverImage(dataBean.getCover(),R.mipmap.ic_22);
        fragmentList.get(0).notifyDataSetChanged(dataBean);
    }

    @Override
    public void getBangumiDetailFailed(String message) {
        Log.d("Playav BangumiDetFailed",message);
    }

    @Override
    public void getBangumiUrlSuccess(BangumiUrlBean.DashBean dataBean) {
        loadPlayer(dataBean.getVideo().get(0).getBaseUrl(),dataBean.getAudio().get(0).getBaseUrl());

    }

    @Override
    public void getBangumiUrlSuccess(BangumiUrlBean.DurlBean dataBean) {
        loadPlayer(dataBean.getUrl());
    }



    @Override
    public void getBangumiUrlFailed(String message) {
        Log.d("Playav BangumiUrlFailed",message);
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onNewIntent(Intent intent) {
        Intent intent1 = getIntent();
        aid = intent1.getIntExtra("av", 62693988) + "";
        season = intent1.getIntExtra("season",0)+"";
        index = intent1.getIntExtra("index",0);
        super.onNewIntent(intent);
    }

    @Override
    public void onBackPressed() {
        if (avPlayer.isIfCurrentIsFullscreen()) {
            avPlayer.getFullWindowPlayer().getFullscreenButton().performClick();
        } else {
            super.onBackPressed();
        }

    }
}
