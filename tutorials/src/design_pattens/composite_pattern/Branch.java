package design_pattens.composite_pattern;

import java.util.ArrayList;

/**
 * Created by juno on 15-7-24.
 */
public class Branch implements IBranch{
    private String name = "";
    private String position = "";
    private int salary = 0;

    ArrayList<ICorp> subordinate = new ArrayList<ICorp>();

    public Branch(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinate.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate(ICorp corp) {
        return this.subordinate;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = info + " "+this.name+" "+this.position+" "+this.salary;
        return info;
    }
}
