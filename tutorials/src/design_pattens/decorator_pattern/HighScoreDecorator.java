package design_pattens.decorator_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHigh(){
        System.out.println("hight");
    }

    @Override
    public void report(){
        this.reportHigh();
        super.report();
    }

}
