package design_pattens.builder_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-6-12.
 */
public abstract class CarModel {
    private ArrayList<String> seq =  new ArrayList<String>();

    public abstract void start();
    public abstract void engineBoom();
    public abstract void stop();

    public void run(){
        for (int i=0; i<this.seq.size(); i++){
            String actionName = this.seq.get(i);

            if (actionName.equals("start")){
                this.start();
            }
            if (actionName.equals("engineBoom")){
                this.engineBoom();
            }
            if (actionName.equals("stop")){
                this.stop();
            }
        }
    }

    public final void setSeq(ArrayList<String> seq){
        this.seq = seq;
    }





}
