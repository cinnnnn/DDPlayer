package top.bilibililike.ddplayer.mvp.login;

public class LoginPresenter {
    private ILoginView mView;
    private ILoginModel mModel;

    public LoginPresenter(ILoginView iLoginView){
        this.mView = iLoginView;
        this.mModel = new LoginModel(this);
    }

    public void login(){
        mModel.doLogin(mView.getUsername(),mView.getPassword());
    }

    public void getHash(){
        mModel.getHash();
    }

    public void getHashFailed(String reason){
        mView.getHashField();
    }

    public void getHashSuccess(){
        mView.getHashSuccess();
    }

    public void loginSuccess(){
        mView.loginSuccess();
    }

    public void loginFailed(String arg){
        mView.loginField(arg);
    }

}

