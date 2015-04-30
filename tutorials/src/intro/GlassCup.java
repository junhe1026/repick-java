package intro;

/**
 * Created by juno on 15-4-28.
 */
public class GlassCup implements Cup{
    private int water = 0;

    @Override
    public void addWater(int w) {
        this.water += w;
    }

    @Override
    public void drinkWater(int w) {
        this.water -= w;
    }

    public int remainWater(){
        return this.water;
    }

}
