package design_pattens.builder_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-6-12.
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> seq);
    public abstract CarModel getModel();
}
