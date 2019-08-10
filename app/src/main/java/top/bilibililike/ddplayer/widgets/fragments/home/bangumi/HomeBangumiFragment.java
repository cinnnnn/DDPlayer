package top.bilibililike.ddplayer.widgets.fragments.home.bangumi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.jakewharton.rxbinding3.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.widgets.fragments.bangumi.BangumiActivity;

public class HomeBangumiFragment extends BaseFragment {
    @BindView(R.id.banner_view)
    ImageView bannerView;
    @BindView(R.id.bangumi_liner)
    LinearLayout bangumiLiner;
    @BindView(R.id.timetable_liner)
    LinearLayout timetableLiner;
    @BindView(R.id.index_liner)
    LinearLayout indexLiner;

    @Override
    public void finishCreateView(Bundle state) {
        initClicks();
        Glide.with(this)
                .asGif()
                .load(R.drawable.matsuri)
                .into(bannerView);

    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_home_bangumi;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

    }

    @SuppressLint("CheckResult")
    private void initClicks(){
        RxView.clicks(bangumiLiner)
                .throttleFirst(500, TimeUnit.MILLISECONDS)
                .subscribe(unit -> {
                    startActivity(new Intent(getActivity(),BangumiActivity.class));
                });

    }



}
