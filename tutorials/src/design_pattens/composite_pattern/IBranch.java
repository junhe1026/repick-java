package design_pattens.composite_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-7-24.
 */
public interface IBranch extends ICorp{

    public void addSubordinate(ICorp corp);

    public ArrayList<ICorp> getSubordinate(ICorp corp);
}
