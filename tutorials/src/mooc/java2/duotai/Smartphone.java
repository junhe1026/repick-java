package mooc.java2.duotai;

/**
 * Created by juno on 15-6-12.
 */
public class Smartphone extends Telephone implements IPlayGame{
    @Override
    public void call() {
        System.out.println("call call");
    }

    @Override
    public void message() {
        System.out.println("msg msg");
    }

    @Override
    public void playGame() {
        System.out.println("phone play game");
    }
}
