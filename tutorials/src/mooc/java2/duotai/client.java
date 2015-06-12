package mooc.java2.duotai;

/**
 * Created by juno on 15-6-12.
 */
public class client {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.eat();

        Animal obj2 = new Dog();
        obj2.eat();

        Shape rec = new Rectangle(2.0, 3.0);
        System.out.println(rec.getDistance());
        System.out.println(rec.getArea());

        Shape circle = new Circle(3);
        System.out.println(circle.getDistance());
        System.out.println(circle.getArea());

    }
}
