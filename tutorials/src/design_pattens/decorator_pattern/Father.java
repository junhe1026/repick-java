package design_pattens.decorator_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr;

        sr = new ConcreteReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();

        sr.sign();
    }
}
