package top.bilibililike.ddplayer.widgets.fragments.avDetail;

import android.os.Bundle;

import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.customedView.videoView.MultiSampleVideo;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_PAUSE;
import static com.shuyu.gsyvideoplayer.video.base.GSYVideoView.CURRENT_STATE_PLAYING;

public class AvCommentFragment extends BaseFragment {
    Disposable mDisposable;
    @BindView(R.id.av_player)
    MultiSampleVideo avPlayer;

    @Override
    public void finishCreateView(Bundle state) {
        initPlayer();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_av_comment;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {
        loadPlayer(t[0].toString(),t[1].toString());
    }

    private void initPlayer() {
        avPlayer.setTag("av0");

        avPlayer.setPlayPosition(3);

        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Accept", "*/*");
        headerMap.put("User-Agent", "Bilibili Freedoooooom/MarkII");
        avPlayer.setMapHeadData(headerMap);

    }

    private void loadPlayer(String avUrl, String audioUrl) {


        avPlayer.setUp(avUrl, false, "播放测试");


        //avPlayer.startAfterPrepared();


        //ijk关闭log
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);


    }

}
