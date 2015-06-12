package mooc.java2.duotai;

/**
 * Created by juno on 15-6-12.
 */
public class Rectangle extends Shape{
    private double l;
    private double w;

    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    @Override
    public double getDistance() {
        return 2*(l+w);
    }

    @Override
    public double getArea() {
        return l*w;
    }
}
