package design_pattens.command_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
