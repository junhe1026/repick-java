package design_pattens.builder_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-6-12.
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> seq) {
        benz.setSeq(seq);
    }

    @Override
    public CarModel getModel() {
        return this.benz;
    }
}
