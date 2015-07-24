package design_pattens.strategy_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        context = new Context(new BackDoor());
        context.operate();

        context = new Context(new GivenGreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();

    }
}
