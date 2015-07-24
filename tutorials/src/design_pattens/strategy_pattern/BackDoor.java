package design_pattens.strategy_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("后门");
    }
}
