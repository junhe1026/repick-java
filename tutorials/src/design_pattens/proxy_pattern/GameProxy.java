package design_pattens.proxy_pattern;

/**
 * Created by juno on 15-7-2.
 * 普通代理模式
 */
public class GameProxy implements IGamePlayer{
    private IGamePlayer player = null;

    public GameProxy(IGamePlayer player){
        this.player = player;
    }

    @Override
    public void login(String username, String password) {
        this.player.login(username, password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void levelUp() {
        this.player.levelUp();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
