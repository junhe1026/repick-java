package design_pattens.strategy_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
