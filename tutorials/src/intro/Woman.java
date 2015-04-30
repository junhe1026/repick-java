package intro;

/**
 * Created by juno on 15-4-28.
 */
public class Woman extends Human{

    public Woman(int h){
        super(h);
        System.out.println("woman in");

    }

    /**
     * override intro.Human.breath()
     */
    public void breath()
    {
        super.breath();
        System.out.println("su...");
    }

}
