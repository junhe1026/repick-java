package design_pattens.chain_of_responsibility_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Woman implements IWoman{
    private int type = 0;
    private String request = "";

    public Woman(int _type, String _request){
        this.type = _type;
        this.request = _request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
