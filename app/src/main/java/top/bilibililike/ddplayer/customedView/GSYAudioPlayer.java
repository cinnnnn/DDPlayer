package top.bilibililike.ddplayer.customedView;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.WindowManager;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;

import top.bilibililike.ddplayer.R;

public class GSYAudioPlayer extends StandardGSYVideoPlayer {


    public GSYAudioPlayer(Context context) {
        super(context);
    }

    public GSYAudioPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onLossAudio() {

    }

    @Override
    protected void onLossTransientAudio() {

    }

    @Override
    protected void onLossTransientCanDuck() {

    }

    @Override
    protected void init(Context context) {
        super.init(context);
        onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
            @Override
            public void onAudioFocusChange(int i) {

            }
        };
    }



   /* @Override
    public int getLayoutId() {
        return R.layout.layout_audio_player;
    }
*/


   /* @Override
    public void startAfterPrepared() {
        if (!mHadPrepared) {
            prepareVideo();
        }

        try {
            if (getGSYVideoManager() != null) {
                getGSYVideoManager().start();
            }

            setStateAndUi(CURRENT_STATE_PLAYING);

            if (getGSYVideoManager() != null && mSeekOnStart > 0) {
                getGSYVideoManager().seekTo(mSeekOnStart);
                mSeekOnStart = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        createNetWorkState();

        listenerNetWorkState();

        mHadPlay = true;

        if (mTextureView != null) {
            mTextureView.onResume();
        }

        if (mPauseBeforePrepared) {
            onVideoPause();
            mPauseBeforePrepared = false;
        }
    }

    @Override
    public void onCompletion() {
        //make me normal first
        setStateAndUi(CURRENT_STATE_NORMAL);
        mSaveChangeViewTIme = 0;
        mCurrentPosition = 0;
        if (!mIfCurrentIsFullscreen) {
            getGSYVideoManager().setListener(null);
            getGSYVideoManager().setLastListener(null);
        }
        getGSYVideoManager().setCurrentVideoHeight(0);
        getGSYVideoManager().setCurrentVideoWidth(0);

        mAudioManager.abandonAudioFocus(onAudioFocusChangeListener);
        if (mContext instanceof Activity) {
            ((Activity) mContext).getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }

        releaseNetWorkState();
    }*/
}
