package top.bilibililike.ddplayer.widgets.fragments;

import android.os.Bundle;

import top.bilibililike.ddplayer.base.BaseFragment;
import top.bilibililike.ddplayer.R;

public class DynamicFragment extends BaseFragment {
    @Override
    public void finishCreateView(Bundle state) {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_dynamic;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

}
}
