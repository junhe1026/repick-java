package mooc.java2.duotai;

/**
 * Created by juno on 15-6-12.
 */
public class Circle extends Shape{

    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getDistance() {
        return (2*Math.PI*r);
    }

    @Override
    public double getArea() {
        return (Math.PI*r*r);
    }
}
