package design_pattens.factory_method_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
