package design_pattens.chain_of_responsibility_pattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by juno on 15-7-24.
 */
public class Client {

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<IWoman> arr = new ArrayList<IWoman>();
        for(int i=0; i<5; i++){
            int temp =rand.nextInt(4);
            System.out.println("--->"+ temp);
            arr.add(new Woman(temp, "shopping"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWoman womem : arr){
            father.HandleMessage(womem);
        }
    }
}
