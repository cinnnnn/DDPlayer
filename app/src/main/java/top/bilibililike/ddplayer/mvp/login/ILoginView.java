package top.bilibililike.ddplayer.mvp.login;

public interface ILoginView {
    String getUsername();
    String getPassword();

    void getHashField(String reason);
    void loginField(String arg);
    void loginSuccess();
}
