package design_pattens.abstract_factory_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class Nvwa {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        maleFactory.createYellowHuman();
        femaleFactory.createYellowHuman();

        maleFactory.createWhiteHuman();
        maleFactory.createWhiteHuman();
    }
}
