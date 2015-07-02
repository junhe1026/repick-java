package design_pattens.proxy_pattern;


/**
 * Created by juno on 15-7-2.
 */
public class Client {

    public static void main(String[] args) {
        // 普通代理模式
        IGamePlayer player = new GamePlayer("Bob");
        IGamePlayer proxy = new GameProxy(player);
        proxy.login("bob", "pass");
        proxy.killBoss();
        proxy.levelUp();
    }
}
