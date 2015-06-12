package mooc.java2.jicheng;

/**
 * Created by juno on 15-6-9.
 */
public class Animal extends Object{
    public int age = 10;
    public String name;

    public void eat(){
        System.out.println("动物具有吃东西的能力");
    }

    public Animal(){
        System.out.println("animal 初始化");
        age = 20;
    }

}
