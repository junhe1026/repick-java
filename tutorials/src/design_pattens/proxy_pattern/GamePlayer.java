package design_pattens.proxy_pattern;

import sun.awt.event.IgnorePaintEvent;

/**
 * Created by juno on 15-7-2.
 */
public class GamePlayer implements IGamePlayer{
    private String player;

    public GamePlayer(String name){
        this.player = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(player+" login");
    }

    @Override
    public void killBoss() {
        System.out.println(player+" kill boss");
    }

    @Override
    public void levelUp() {
        System.out.println(player+" level up");
    }

    @Override
    public IGamePlayer getProxy() {
        return null;
    }
}
