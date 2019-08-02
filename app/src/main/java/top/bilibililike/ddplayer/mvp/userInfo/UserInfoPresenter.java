package top.bilibililike.ddplayer.mvp.userInfo;

public class UserInfoPresenter {
    private IUserInfoView view;
    private IUserInfoModel model;

    public UserInfoPresenter(IUserInfoView view){
        this.view = view;
        model = new UserInfoModel(this);

    }

    public void loadUserInfo(){
        model.getUserInfo();
    }


    public void getUserInfoSucceed(){
        view.updateUserInfoSuccess();
    }

    public void getUserInfoFailed(String arg){
        view.updateUserInfoFailed(arg);
    }
}
