package design_pattens.decorator_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class ConcreteReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("report grade");
    }

    @Override
    public void sign() {
        System.out.println("need sign");
    }
}
