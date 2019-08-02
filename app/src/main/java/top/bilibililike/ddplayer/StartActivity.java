package top.bilibililike.ddplayer;

import android.content.Intent;
import android.os.Bundle;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

import org.litepal.LitePal;

import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.entity.TokenBean;
import top.bilibililike.ddplayer.entity.UserInfoBean;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.widgets.MainActivity;

public class StartActivity extends BaseActivity {


    @Override
    public int getLayoutId() {

        return R.layout.activity_start;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //init Bugly
        CrashReport.initCrashReport(getApplicationContext(), "e96d25f474", true);
        //init LitePal
       // LitePal.initialize(this);
        //init defaultNetworkParams
        Api.initParams();
        startActivity(new Intent(StartActivity.this, MainActivity.class));
        finish();
    }


}
