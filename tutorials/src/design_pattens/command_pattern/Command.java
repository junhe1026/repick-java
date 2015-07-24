package design_pattens.command_pattern;

/**
 * Created by juno on 15-7-24.
 */
public abstract class Command {
    protected  RequirementGroup rg = new RequirementGroup();
    protected  PageGroup pg = new PageGroup();
    protected  CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
