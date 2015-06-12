package design_pattens.factory_method_pattern;

/**
 * Created by juno on 15-6-11.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory bagualu = new HumanFactory();

        System.out.println("造白人");
        Human whiteHuman = bagualu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("造黑人");
        Human blackHuman = bagualu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("造黄种人");
        Human yellowHuman = bagualu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
