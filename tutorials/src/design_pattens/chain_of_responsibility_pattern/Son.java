package design_pattens.chain_of_responsibility_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Son extends Handler{
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("Son response");
    }
}
