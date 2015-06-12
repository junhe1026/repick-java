package design_pattens.template_method_pattern;

/**
 * Created by juno on 15-6-12.
 */
public class client {
    public static void main(String[] args) {
        HammerModel h1 = new HammerH1();
        h1.run();

        HammerModel h2 = new HammerH2();
        h2.run();
    }
}
