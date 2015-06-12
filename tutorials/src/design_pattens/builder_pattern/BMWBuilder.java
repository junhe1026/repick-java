package design_pattens.builder_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-6-12.
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> seq) {
        bmw.setSeq(seq);
    }

    @Override
    public CarModel getModel() {
        return this.bmw;
    }
}
