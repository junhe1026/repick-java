package design_pattens.factory_method_pattern;


/**
 * Created by juno on 15-6-11.
 */

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
