package design_pattens.template_method_pattern;

/**
 * Created by juno on 15-6-12.
 */
public abstract class HammerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    };
}
