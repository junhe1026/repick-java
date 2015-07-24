package design_pattens.chain_of_responsibility_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Husband extends Handler{
    public Husband(){
        super(Handler.HUSTBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("Husband response");
    }
}
