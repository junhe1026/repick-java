package design_pattens.decorator_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("sort");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
