package design_pattens.factory_method_pattern;


/**
 * Created by juno on 15-6-11.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人白色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
