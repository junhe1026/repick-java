package design_pattens.builder_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-6-12.
 *
 */
public class Director {
    private ArrayList<String> seq = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
        // 具体的model怎么组装，由此定义
        this.seq.clear();
        this.seq.add("start");
        this.seq.add("stop");
        benzBuilder.setSequence(seq);
        return (BenzModel) this.benzBuilder.getModel();
    }

    public BenzModel getBBenzModel(){
        this.seq.clear();
        this.seq.add("start");
        this.seq.add("engineBoom");
        this.seq.add("stop");
        benzBuilder.setSequence(seq);
        return (BenzModel) this.benzBuilder.getModel();
    }

    public BMWModel getABMWModel(){
        this.seq.clear();
        this.seq.add("start");
        this.seq.add("stop");
        bmwBuilder.setSequence(seq);
        return (BMWModel) this.bmwBuilder.getModel();
    }

}
