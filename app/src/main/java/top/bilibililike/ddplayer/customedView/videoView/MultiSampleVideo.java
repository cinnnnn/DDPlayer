package top.bilibililike.ddplayer.customedView.videoView;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;

import top.bilibililike.ddplayer.R;


/**
 * 多个同时播放的播放控件
 * Created by guoshuyu on 2018/1/31.
 */

public class MultiSampleVideo extends StandardGSYVideoPlayer {

    private final static String TAG = "MultiSampleVideo";


    ImageView mCoverImage;

    String mCoverOriginUrl;

    int mDefaultRes;

    public MultiSampleVideo(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public MultiSampleVideo(Context context) {
        super(context);
    }

    public MultiSampleVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void init(Context context) {
        super.init(context);
       /* mCoverImage = (ImageView) findViewById(R.id.thumbImage);
        if (mThumbImageViewLayout != null &&
                (mCurrentState == -1 || mCurrentState == CURRENT_STATE_NORMAL || mCurrentState == CURRENT_STATE_ERROR)) {
            mThumbImageViewLayout.setVisibility(VISIBLE);
        }*/
        onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
            @Override
            public void onAudioFocusChange(int focusChange) {
                switch (focusChange) {
                    case AudioManager.AUDIOFOCUS_GAIN:
                        break;
                    case AudioManager.AUDIOFOCUS_LOSS:
                        //todo 判断如果不是外界造成的就不处理


                        break;
                    case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:
                        //todo 判断如果不是外界造成的就不处理

                        break;
                    case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:
                        break;
                }
            }
        };
    }

    @Override
    public GSYVideoViewBridge getGSYVideoManager() {
        CustomManager.getCustomManager(getKey()).initContext(getContext().getApplicationContext());
        return CustomManager.getCustomManager(getKey());
    }

    @Override
    protected boolean backFromFull(Context context) {
        return CustomManager.backFromWindowFull(context, getKey());
    }

    @Override
    protected void releaseVideos() {
        CustomManager.releaseAllVideos(getKey());
    }


    @Override
    protected int getFullId() {
        return CustomManager.FULLSCREEN_ID;
    }

    @Override
    protected int getSmallId() {
        return CustomManager.SMALL_ID;
    }

    /**
     *
     * @param progress      应该是百分比
     * @param secProgress  一直是0 不知道干嘛的
     * @param currentTime 当前进度毫秒数
     * @param totalTime     总时长（ms）
     */

    @Override
    protected void setProgressAndTime(int progress, int secProgress, int currentTime, int totalTime) {
        this.progress = progress;
        this.secProgress = secProgress;
        this.currentTime = currentTime;
        this.totalTime = totalTime;
        if (getTag().equals("av")){
            Log.d("Multi",getTag().toString()+"progress = "+progress);
            Log.d("Multi",getTag().toString()+"secProgress = "+secProgress);
            Log.d("Multi",getTag().toString()+"currentTime = "+currentTime);
            Log.d("Multi",getTag().toString()+"totalTime = "+totalTime);
        }
        if (mGSYVideoProgressListener != null && mCurrentState == CURRENT_STATE_PLAYING) {
            mGSYVideoProgressListener.onProgress(progress, secProgress, currentTime, totalTime);
        }

        if (mProgressBar == null || mTotalTimeTextView == null || mCurrentTimeTextView == null) {
            return;
        }
        if(mHadSeekTouch) {
            return;
        }
        if (!mTouchingProgressBar) {
            if (progress != 0) mProgressBar.setProgress(progress);
        }
        if (getGSYVideoManager().getBufferedPercentage() > 0) {
            secProgress = getGSYVideoManager().getBufferedPercentage();
        }
        if (secProgress > 94) secProgress = 100;
        setSecondaryProgress(secProgress);
        mTotalTimeTextView.setText(CommonUtil.stringForTime(totalTime));
        if (currentTime > 0)
            mCurrentTimeTextView.setText(CommonUtil.stringForTime(currentTime));

        if (mBottomProgressBar != null) {
            if (progress != 0) mBottomProgressBar.setProgress(progress);
            setSecondaryProgress(secProgress);
        }
    }

    @Override
    public GSYBaseVideoPlayer showSmallVideo(Point size, boolean actionBar, boolean statusBar) {
        //下面这里替换成你自己的强制转化
        MultiSampleVideo multiSampleVideo = (MultiSampleVideo) super.showSmallVideo(size, actionBar, statusBar);
        multiSampleVideo.mStartButton.setVisibility(GONE);
        multiSampleVideo.mStartButton = null;
        return multiSampleVideo;
    }

    public String getKey() {
        if (mPlayPosition == -22) {
            Debuger.printfError(getClass().getSimpleName() + " used getKey() " + "******* PlayPosition never set. ********");
        }
        if (TextUtils.isEmpty(mPlayTag)) {
            Debuger.printfError(getClass().getSimpleName() + " used getKey() " + "******* PlayTag never set. ********");
        }
        return TAG + mPlayPosition + mPlayTag;
    }



    public int getProgress() {
        return progress;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    int progress,  secProgress,  currentTime,  totalTime;

}
