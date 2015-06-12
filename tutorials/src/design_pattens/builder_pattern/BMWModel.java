package design_pattens.builder_pattern;

/**
 * Created by juno on 15-6-12.
 */
public class BMWModel extends CarModel{
    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void engineBoom() {
        System.out.println("BMW boom");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }
}
