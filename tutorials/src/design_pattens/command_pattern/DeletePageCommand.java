package design_pattens.command_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class DeletePageCommand extends Command{
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
