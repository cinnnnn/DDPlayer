package top.bilibililike.ddplayer;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

import androidx.annotation.RequiresApi;

import tv.danmaku.ijk.media.player.IMediaPlayer;

public class DDPlayer extends FrameLayout {
    private Context mContext;
    private SurfaceView mSurfaceView;
    private IMediaPlayer mMediaPlayer = null;

    public DDPlayer(Context context) {
        super(context);
    }
    public DDPlayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DDPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void init(Context context){
        this.mContext = context;

    }


    private void createSurfaceView(){
        mSurfaceView = new SurfaceView(mContext);
        mSurfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {

            }

            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
                if (mMediaPlayer != null){
                    mMediaPlayer.setDisplay(surfaceHolder);
                }
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

            }
        });

        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT
                , LayoutParams.MATCH_PARENT, Gravity.CENTER);
        addView(mSurfaceView,0,layoutParams);
    }


}
