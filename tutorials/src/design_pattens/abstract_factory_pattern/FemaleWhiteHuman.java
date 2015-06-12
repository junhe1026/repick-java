package design_pattens.abstract_factory_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("女");
    }
}
