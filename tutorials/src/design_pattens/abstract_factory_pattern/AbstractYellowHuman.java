package design_pattens.abstract_factory_pattern;

/**
 * Created by juno on 15-6-11.
 */
public abstract class AbstractYellowHuman implements Human{
    public void getColor(){
        System.out.println("黄色");
    }

    public void talk(){
        System.out.println("黄说");
    }
}
