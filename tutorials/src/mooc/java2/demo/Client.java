package mooc.java2.demo;

/**
 * Created by juno on 15-6-12.
 */
public class Client {
    public static void main(String[] args) {
        Person c = new Chinese();
        c.say();
        Person a = new American();
        a.say();
    }
}
