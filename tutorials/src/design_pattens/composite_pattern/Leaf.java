package design_pattens.composite_pattern;

/**
 * Created by juno on 15-7-24.
 */
public class Leaf implements ILeaf{
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public String getInfo() {
        String info = "";
        info = info + " "+this.name+" "+this.position+" "+this.salary;
        return info;
    }
}
