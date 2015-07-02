package design_pattens.proxy_pattern;

/**
 * Created by juno on 15-7-2.
 * 代理模式
 */
public interface IGamePlayer {
    // 游戏玩家接口

    void login(String username, String password);
    void killBoss();
    void levelUp();

    // 强制代理需要获取当前代理
    IGamePlayer getProxy();

}
