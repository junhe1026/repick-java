package mooc.java2.jicheng;

/**
 * Created by juno on 15-6-9.
 */
public class Dog extends Animal{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    public int age = 10;

    @Override
    public String toString() {
        return "Dog<age"+ this.age+'>';
    }

    public Dog(){
        super();
        System.out.println("dog 初始化");
    }


}
