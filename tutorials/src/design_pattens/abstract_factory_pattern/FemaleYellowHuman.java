package design_pattens.abstract_factory_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("女");
    }
}
