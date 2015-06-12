package mooc.java2.jicheng;

/**
 * Created by juno on 15-6-9.
 */
public class Initial {
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println(a.age);

        Dog dog = new Dog();
        dog.age = 10;
        dog.eat();
        System.out.println(dog);

        Dog dog2 = new Dog();

        if (dog.equals(dog2)){
            System.out.println(" equals ");
        }
        else{
            System.out.println(" not equal");
        }

    }
}
