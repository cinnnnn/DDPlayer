package top.bilibililike.ddplayer.widgets.fragments;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;

public class MallFragment extends BaseFragment {
    @BindView(R.id.edtv_feedback)
    EditText edtvFeedback;
    @BindView(R.id.tv_pull_request)
    TextView tvPullRequest;

    @Override
    public void finishCreateView(Bundle state) {
        RxView.clicks(tvPullRequest)
                .throttleFirst( 2 , TimeUnit.SECONDS )
                .subscribe(new Observer<Unit>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Unit unit) {
                        if (!edtvFeedback.getText().toString().equals("")){
                            CrashReport.postCatchedException(
                                    new Throwable("用户反馈: "+
                                            edtvFeedback.getText().toString()
                                    )
                            );
                            Toast.makeText(getActivity(),"已收到反馈，会尽快更新",Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(getActivity(),"反馈失败，请稍后再试",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_mall;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

    }
}
