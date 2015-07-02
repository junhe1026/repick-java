package design_pattens.proxy_pattern;

/**
 * Created by juno on 15-7-2.
 *
 * 强制代理
 */
public class GamePlayer2 implements IGamePlayer {
    private IGamePlayer proxy = null;
    private String name = "";

    public GamePlayer2(String name){
        this.name = name;
    }

    @Override
    public void login(String username, String password) {

        if (isProxy()){
            System.out.println("login");
        }
        else{
            System.out.println("need proxy");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()){
            System.out.println("kill");
        }
        else{
            System.out.println("need proxy");
        }

    }

    @Override
    public void levelUp() {
        if (isProxy()){
            System.out.println("level");
        }
        else{
            System.out.println("need proxy");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        // 为自己找个代理
        this.proxy = new GameProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        return this.proxy != null;
    }
}
