package design_pattens.builder_pattern;

/**
 * Created by juno on 15-6-12.
 */
public class BenzModel extends CarModel{
    @Override
    public void start() {
        System.out.println("Benz Start");
    }

    @Override
    public void engineBoom() {
        System.out.println("Benz engine");
    }

    @Override
    public void stop() {
        System.out.println("Benz stop");
    }
}
