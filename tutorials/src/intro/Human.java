package intro;

/**
 *
 * Created by juno on 15-4-28.
 */
public class Human {
    private int height;

    /**
     * constructor
     */
    Human(int h) {
        this.height = h;
        System.out.println("I'm born");
    }

    /**
     * constructor 2
     */
    Human(int h, String name){
        this.height = h;
        System.out.println(name+" born");
    }


    protected void breath(){
        System.out.println("hu....hu...");
    }

    public int getHeight(){
        return this.height;
    }

    public void growHeight(int h){
//        this.height = this.height + h;
        this.height += h;
    }

    public void repeatBreath(int times){
        for(int i=0; i<times; i++){
            this.breath();
        }
    }
}
