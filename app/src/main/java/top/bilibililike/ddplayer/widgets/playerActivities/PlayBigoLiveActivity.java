package top.bilibililike.ddplayer.widgets.playerActivities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.customedView.videoView.CustomManager;
import top.bilibililike.ddplayer.customedView.videoView.MultiSampleVideo;

public class PlayBigoLiveActivity extends BaseActivity {
    String url;
    @BindView(R.id.av_player)
    MultiSampleVideo avPlayer;

    @Override
    public int getLayoutId() {
        return R.layout.activity_play_live;
    }

    @Override
    protected void doBeforeSetContent() {
        //去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //隐藏顶部的状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.doBeforeSetContent();
    }



    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent = getIntent();
        this.url = intent.getStringExtra("url");
        Log.d("LiveActivity url =",url);
        avPlayer.setUp(url,false,"直播测试");
        avPlayer.setAutoFullWithSize(true);
        avPlayer.setShowFullAnimation(true);
        avPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //audioPlayer.startWindowFullscreen(PlayAvActivity.this,false,false);
                avPlayer.startWindowFullscreen(PlayBigoLiveActivity.this, false, false);

            }
        });
        avPlayer.getBackButton().setOnClickListener(view -> onBackPressed());
        avPlayer.startAfterPrepared();
    }


    @Override
    protected void onNewIntent(Intent intent) {
        Intent intent1 = getIntent();
        this.url = intent1.getStringExtra("url");
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
        CustomManager.clearAllVideo();
    }

}
