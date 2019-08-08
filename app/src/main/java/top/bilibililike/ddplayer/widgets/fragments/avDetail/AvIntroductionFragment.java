package top.bilibililike.ddplayer.widgets.fragments.avDetail;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.entity.AVDetailBean;

public class AvIntroductionFragment extends BaseFragment {
    @BindView(R.id.title)
    TextView title;
    private AVDetailBean.DataBean dataBean;

    @Override
    public void finishCreateView(Bundle state) {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_av_introduction;
    }


    /**
     * @param t AVDetailBean.DataBean dataBean
     */
    @Override
    public void notifyDataSetChanged(Object[] t) {
        this.dataBean = (AVDetailBean.DataBean) t[0];
        title.setText(dataBean.getTitle());
    }


    /*public void notifyDataSetChanged(AVDetailBean.DataBean dataBean) {

    }*/
}
