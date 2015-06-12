package design_pattens.abstract_factory_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
