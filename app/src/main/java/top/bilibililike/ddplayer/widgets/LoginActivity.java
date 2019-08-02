package top.bilibililike.ddplayer.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import org.litepal.LitePal;

import butterknife.BindView;
import top.bilibililike.ddplayer.base.BaseActivity;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.mvp.login.ILoginView;
import top.bilibililike.ddplayer.mvp.login.LoginPresenter;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;
import static top.bilibililike.ddplayer.utils.StatusCode.EVENT_LOGIN;

public class LoginActivity extends BaseActivity implements ILoginView {



    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.img_22)
    ImageView img22;
    @BindView(R.id.img_33)
    ImageView img33;
    @BindView(R.id.etv_username)
    EditText etvUsername;
    @BindView(R.id.etv_passwd)
    EditText etvPasswd;
    @BindView(R.id.status_Bar)
    View statusBar;
    @BindView(R.id.btn_login)
    TextView loginBtn;

    LoginPresenter presenter ;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        initStatus(statusBar);
        initToolBar();
        initEggs();
        loginBtn.setOnClickListener(v -> presenter.getHash());
        initData();
    }

    private void initToolBar(){
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    private void initEggs(){
        etvPasswd.setOnFocusChangeListener((view, b) -> {
            if (b){
                img22.setImageDrawable(getResources().getDrawable(R.mipmap.ic_22_hide));
                img33.setImageDrawable(getResources().getDrawable(R.mipmap.ic_33_hide));
            }else {
                img22.setImageDrawable(getResources().getDrawable(R.mipmap.ic_22));
                img33.setImageDrawable(getResources().getDrawable(R.mipmap.ic_33));
            }
        });
    }



    private void initData(){
        presenter = new LoginPresenter(this);

    }



    @Override
    public String getUsername() {
        return etvUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return etvPasswd.getText().toString();
    }

    @Override
    public void getHashField() {
        Toast.makeText(this,"请检查网络",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getHashSuccess() {
        presenter.login();
    }

    @Override
    public void loginField(String arg) {
        Toast.makeText(this,"登录失败,"+arg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this,"登录成功,你好",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        intent.setFlags(FLAG_ACTIVITY_CLEAR_TOP);
        startActivityForResult(intent,EVENT_LOGIN);
        finish();
    }

}
