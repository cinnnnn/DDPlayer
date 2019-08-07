package top.bilibililike.ddplayer.customedView;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import top.bilibililike.ddplayer.R;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class GSYAVPlayer extends StandardGSYVideoPlayer {
    public GSYAVPlayer(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public GSYAVPlayer(Context context) {
        super(context);
    }

    public GSYAVPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    String audioUrl = "http://111.47.237.6/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565108100&platform=android&ssig=g4EapNuhHopoDNFovjBZKA&oi=614316940&trid=282d34884a454e6dbe4769305059e932&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396";


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
    }


/*
    @Override
    protected void startPrepare() {
        if (getGSYVideoManager().listener() != null) {
            getGSYVideoManager().listener().onCompletion();
        }
        if (mVideoAllCallBack != null) {
            Debuger.printfLog("onStartPrepared");
            mVideoAllCallBack.onStartPrepared(mOriginUrl, mTitle, this);
        }
        getGSYVideoManager().setListener(this);
        getGSYVideoManager().setPlayTag(mPlayTag);
        getGSYVideoManager().setPlayPosition(mPlayPosition);
        if (mContext instanceof Activity) {
            ((Activity) mContext).getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        mBackUpPlayingBufferState = -1;
        getGSYVideoManager().prepare(mUrl, (mMapHeadData == null) ? new HashMap<String, String>() : mMapHeadData, mLooping, mSpeed, mCache, mCachePath, mOverrideExtension);
        setStateAndUi(CURRENT_STATE_PREPAREING);
    }

    @Override
    public void onAutoCompletion() {
        setStateAndUi(CURRENT_STATE_AUTO_COMPLETE);

        mSaveChangeViewTIme = 0;
        mCurrentPosition = 0;

        if (mTextureViewContainer.getChildCount() > 0) {
            mTextureViewContainer.removeAllViews();
        }

        if (!mIfCurrentIsFullscreen)
            getGSYVideoManager().setLastListener(null);

        if (mContext instanceof Activity) {
            ((Activity) mContext).getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        releaseNetWorkState();

        if (mVideoAllCallBack != null && isCurrentMediaListener()) {
            Debuger.printfLog("onAutoComplete");
            mVideoAllCallBack.onAutoComplete(mOriginUrl, mTitle, this);
        }
    }

    @Override
    public void onCompletion() {
        //make me normal first
        setStateAndUi(CURRENT_STATE_NORMAL);

        mSaveChangeViewTIme = 0;
        mCurrentPosition = 0;

        if (mTextureViewContainer.getChildCount() > 0) {
            mTextureViewContainer.removeAllViews();
        }

        if (!mIfCurrentIsFullscreen) {
            getGSYVideoManager().setListener(null);
            getGSYVideoManager().setLastListener(null);
        }
        getGSYVideoManager().setCurrentVideoHeight(0);
        getGSYVideoManager().setCurrentVideoWidth(0);

        if (mContext instanceof Activity) {
            ((Activity) mContext).getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }

        releaseNetWorkState();
    }*/


}
