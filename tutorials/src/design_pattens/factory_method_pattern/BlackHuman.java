package design_pattens.factory_method_pattern;


/**
 * Created by juno on 15-6-11.
 */
public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑人黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");

    }
}
