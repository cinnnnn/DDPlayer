package top.bilibililike.ddplayer.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.utils.statusBar.StatusBarUtil;

public class UserDetailActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_user_detail;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        StatusBarUtil.setRootViewFitsSystemWindows(this,false);
    }
}
