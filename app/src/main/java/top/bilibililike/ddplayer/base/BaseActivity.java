package top.bilibililike.ddplayer.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.bilibililike.ddplayer.utils.statusBar.StatusBarUtil;

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        initStatusBar();
        bind = ButterKnife.bind(this);
        initViews(savedInstanceState);
    }

    public abstract int getLayoutId();

    public abstract void initViews(Bundle savedInstanceState);



    private void initStatusBar() {
        //这里注意下 因为在评论区发现有网友调用setRootViewFitsSystemWindows 里面 winContent.getChildCount()=0 导致代码无法继续
        //是因为你需要在setContentView之后才可以调用 setRootViewFitsSystemWindows

        //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding
      /*  StatusBarUtil.setRootViewFitsSystemWindows(this,true);
        //设置状态栏透明
        StatusBarUtil.setTranslucentStatus(this);*/
        if(Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.setStatusBarColor(Color.TRANSPARENT);

           /* View rootView = getWindow().getDecorView().getRootView();
            rootView.setPadding(0,StatusBarUtil.getStatusBarHeight(this), 0, 0);*/

        }





    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    protected void initStatus(View view){
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        params.height = StatusBarUtil.getStatusBarHeight(this);
        view.setLayoutParams(params);
    }
}
