package design_pattens.template_method_pattern;

/**
 * Created by juno on 15-6-12.
 */
public class HammerH1 extends HammerModel{
    @Override
    public void start() {
        System.out.println("H1 start");

    }

    @Override
    public void stop() {
        System.out.println("H1 stop");

    }

    @Override
    public void alarm() {
        System.out.println("H1 alarm");

    }

    @Override
    public void engineBoom() {
        System.out.println("H1 boom");

    }
}
