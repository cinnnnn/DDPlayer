package top.bilibililike.ddplayer;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

import org.litepal.LitePal;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.entity.TokenBean;
import top.bilibililike.ddplayer.entity.UserInfoBean;
import top.bilibililike.ddplayer.utils.Api;
import top.bilibililike.ddplayer.widgets.MainActivity;
import top.bilibililike.ddplayer.widgets.PlayAvActivity;

public class StartActivity extends BaseActivity {


    @Override
    public int getLayoutId() {

        return R.layout.activity_start;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //init Bugly
        Bugly.init(getApplicationContext(), "e96d25f474", false);
        //init LitePal
       // LitePal.initialize(this);
        //init defaultNetworkParams
        Api.initParams();
        requestPermission();

       // startActivity(new Intent(StartActivity.this, PlayAvActivity.class));
        finish();
    }

    private void requestPermission() {
        RxPermissions permissions = new RxPermissions(this);
        permissions.requestEach(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(permission -> {
                    if (permission.granted) {
                        // 用户已经同意该权限
                        Log.d("startActivity", permission.name + " is granted.");
                        startActivity(new Intent(StartActivity.this, MainActivity.class));
                    } else if (permission.shouldShowRequestPermissionRationale) {
                        // 用户拒绝了该权限，没有选中『不再询问』（Never ask again）,那么下次再次启动时，还会提示请求权限的对话框
                        Log.d("startActivity", permission.name + " is denied. More info should be provided.");

                    } else {
                        // 用户拒绝了该权限，并且选中『不再询问』
                        Log.d("startActivity", permission.name + " is denied.");

                    }

                });


    }

}
