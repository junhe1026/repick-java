package mooc.java2.duotai;

/**
 * Created by juno on 15-6-12.
 */
public class Cellphone extends Telephone{
    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void message() {
        System.out.println("msg");
    }
}
