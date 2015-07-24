package design_pattens.chain_of_responsibility_pattern;

/**
 * Created by juno on 15-7-24.
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSTBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int _level){
        this.level = _level;
    }

    public final void HandleMessage(IWoman woman){
        if (woman.getType() == this.level){
            this.response(woman);
        }
        else if (this.nextHandler != null){
            this.nextHandler.HandleMessage(woman);
        }
        else{
            System.out.println("not being handled");
        }

    }

    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    protected abstract void response(IWoman woman);

}
