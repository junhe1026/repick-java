package intro;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.source.tree.NewArrayTree;

import java.io.*;
import java.util.*;
/**
 * Created by juno on 15-5-7.
 */

public class Test {
    public static void main(String[] args){
        /*
        Human[] persons = new Human[2];
        persons[0] = new Human(170, "Alice");
        persons[1] = new Human(172, "Bob");

        int[] a = {1,2,3,4,5};

        String[] names = {"a", "b"};
        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        System.out.println(l1.size());
        l1.remove(0);
        System.out.println(l1.get(0));  // b

        Map<String, Human> m = new HashMap<String, Human>();
        m.put("a", persons[0]);
        m.put("b", persons[1]);
        System.out.println(m.get("a"));
        NewThread thread1 = new NewThread();
        NewThread thread2 = new NewThread();
        thread1.start();
        thread2.start();
        try{
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();

        }
        catch(IOException e){
            System.out.println("IO Problem");
            System.out.println(e);
        }
        try{
            String content = "Thank you for your fish.";
            File file = new File("new.txt");

            if (!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

        }
        catch (IOException e){
            System.out.println("IO Problem");
            System.out.println(e);

        }
        */


    }
}

class NewThread extends Thread {
    private static int threadID = 0;

    public NewThread(){
        super("ID:"+(++threadID));
    }

    public String toString(){
        return super.getName();
    }

    public void run(){
        System.out.println(this);
    }
}
