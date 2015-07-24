package design_pattens.command_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
