package design_pattens.chain_of_responsibility_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Father extends Handler{
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("father response");
    }
}
