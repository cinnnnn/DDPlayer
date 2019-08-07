package top.bilibililike.ddplayer.widgets;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.model.GSYModel;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.shuyu.gsyvideoplayer.render.view.GSYSurfaceView;
import com.shuyu.gsyvideoplayer.video.GSYADVideoPlayer;
import com.shuyu.gsyvideoplayer.video.GSYSampleADVideoPlayer;
import com.shuyu.gsyvideoplayer.video.NormalGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;

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
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.customedView.GSYAVPlayer;
import top.bilibililike.ddplayer.customedView.GSYAudioPlayer;
import top.bilibililike.ddplayer.customedView.videoView.MultiSampleVideo;
import top.bilibililike.ddplayer.utils.AppBarStateChangeListener;
import top.bilibililike.ddplayer.utils.ViewPagerAdapter;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvCommentFragment;
import top.bilibililike.ddplayer.widgets.fragments.avDetail.AvIntroductionFragment;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class PlayAvActivity extends BaseActivity {

    @BindView(R.id.player)
    MultiSampleVideo player;
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
    @BindView(R.id.audio_player)
    MultiSampleVideo audioPlayer;

    List<BaseFragment> fragmentList;

    private boolean isPlay = false;


    @Override
    public int getLayoutId() {
        return R.layout.activity_play_av;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initBasicView();
        initFragmentAndViewPager();
        initTabLayout();
        initPlayer();


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

    private void initFragmentAndViewPager() {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        } else {
            fragmentList.clear();
        }
        fragmentList.add(new AvIntroductionFragment());
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
        player.setTag("av");
        audioPlayer.setTag("audio");
        player.setPlayPosition(0);
        audioPlayer.setPlayPosition(1);

        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Accept", "*/*");
        player.setMapHeadData(headerMap);
        audioPlayer.setMapHeadData(headerMap);
        String url = "http://111.47.237.9/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565097000&platform=android&ssig=blo4-V7EASbAeMqrj0ooWQ&oi=614316540&trid=580f5f61f7dd49d7adf5ce32c1c10588&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396";

        String audioUrl = "http://111.47.237.6/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565108100&platform=android&ssig=g4EapNuhHopoDNFovjBZKA&oi=614316940&trid=282d34884a454e6dbe4769305059e932&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396";
        player.setUp(url, true, "播放测试");
        audioPlayer.setUp(audioUrl, true, "音频测试");
        audioPlayer.startAfterPrepared();
        player.startAfterPrepared();


        //ijk关闭log
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);

        Observable.just(audioPlayer.getCurrentTime())
                .takeWhile(param -> isPlay)
                .interval(50,TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        if (audioPlayer.getCurrentTime() - player.getCurrentTime() > 200){
                            audioPlayer.getGSYVideoManager().setSpeed(0.9f,true);
                            Log.d("PlayAvActivity ","大于");

                        }else if (audioPlayer.getCurrentTime() - player.getCurrentTime() < -200){
                            audioPlayer.getGSYVideoManager().setSpeed(1.1f,true);
                            Log.d("PlayAvActivity ","小于");
                        }else {
                            audioPlayer.getGSYVideoManager().setSpeed(1,true);
                        }

                        Log.d("PlayAvActivity ","playerPo = "+player.getCurrentTime());
                        Log.d("PlayAvActivity ","playerTotol = "+player.getTotalTime());
                        Log.d("PlayAvActivity ","audioPo = "+audioPlayer.getCurrentTime());
                        Log.d("PlayAvActivity ","audioTotol = "+audioPlayer.getTotalTime());
                    }
                });







        player.getGSYVideoManager().setListener(new GSYMediaPlayerListener() {
            @Override
            public void onPrepared() {

            }

            @Override
            public void onAutoCompletion() {

            }

            @Override
            public void onCompletion() {

            }

            @Override
            public void onBufferingUpdate(int percent) {

            }

            @Override
            public void onSeekComplete() {
                audioPlayer.onSeekComplete();
            }

            @Override
            public void onError(int what, int extra) {
                audioPlayer.onError(what,extra);
            }

            @Override
            public void onInfo(int what, int extra) {
                audioPlayer.onInfo(what,extra);
            }

            @Override
            public void onVideoSizeChanged() {
                audioPlayer.onVideoSizeChanged();
            }

            @Override
            public void onBackFullscreen() {
                audioPlayer.onBackFullscreen();
            }

            @Override
            public void onVideoPause() {
                audioPlayer.getGSYVideoManager().pause();
                isPlay = false;
            }

            @Override
            public void onVideoResume() {
                audioPlayer.onVideoResume();
            }

            @Override
            public void onVideoResume(boolean seek) {
                audioPlayer.onVideoResume(seek);
            }
        });


        /*//多个播放时必须在setUpLazy、setUp和getGSYVideoManager()等前面设置
        holder.gsyVideoPlayer.setPlayTag(TAG);
        holder.gsyVideoPlayer.setPlayPosition(position);

        boolean isPlaying = holder.gsyVideoPlayer.getCurrentPlayer().isInPlayingState();

        if (!isPlaying) {
            holder.gsyVideoPlayer.setUpLazy(url, false, null, null, "这是title");
        }

        //增加title
        holder.gsyVideoPlayer.getTitleTextView().setVisibility(View.GONE);

        //设置返回键
        holder.gsyVideoPlayer.getBackButton().setVisibility(View.GONE);*/

    }

    /*

     */
/**
 * 获取当前播放进度
 *//*

    int jindu = player.getCurrentPositionWhenPlaying();

    */
/**
 * 获取当前总时长
 *//*

    int amountTime = player.getDuration();
    */
/**
 * 设置播放速度
 *//*

        player.setSpeed(1);
*/

    @Override
    protected void onDestroy() {
        player.getGSYVideoManager().stop();
        player.release();
        audioPlayer.getGSYVideoManager().stop();
        audioPlayer.release();

        super.onDestroy();
    }
}
