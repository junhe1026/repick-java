package mooc.java2;

/**
 * Created by juno on 15-6-9.
 */
public class Telphone {
    private float screen;
    private float cpu;
    private float mem;

    /**
     * 空构造器
     */
    public Telphone(){

    }

    /**
     * 带参数构造器
     * @param screen
     * @param cpu
     * @param mem
     */
    public Telphone(float screen, float cpu, float mem){
        this.screen = screen;
        this.cpu = cpu;
        this.mem = mem;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }


}
