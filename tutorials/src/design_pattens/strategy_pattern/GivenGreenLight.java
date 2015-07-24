package design_pattens.strategy_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.printf("Green light");
    }
}
