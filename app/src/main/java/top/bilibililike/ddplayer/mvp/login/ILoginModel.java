package top.bilibililike.ddplayer.mvp.login;

public interface ILoginModel {
    void doLogin(String username,String password);
    void getHash();
}
