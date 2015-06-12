package design_pattens.builder_pattern;

/**
 * Created by juno on 15-6-12.
 */
public class Client {
    public static void main(String[] args) {
        Director dir = new Director();

        BenzModel benzA = dir.getABenzModel();
        benzA.run();

        BenzModel benzB = dir.getBBenzModel();
        benzB.run();

        BMWModel bmw = dir.getABMWModel();
        bmw.run();
    }
}
