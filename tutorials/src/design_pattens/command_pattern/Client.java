package design_pattens.command_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Client {

    public static void main(String[] args) {
        Invoker i = new Invoker();
        Command c = new AddRequirementCommand();
//        Command c = new DeletePageCommand();
        i.setCommand(c);
        i.action();


    }
}
