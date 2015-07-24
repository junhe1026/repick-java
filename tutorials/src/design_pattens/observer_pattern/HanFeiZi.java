package design_pattens.observer_pattern;


import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by juno on 15-7-24.
 */
public class HanFeiZi implements IHanFeiZi, Observable{
    private ArrayList<Observer> observers = new ArrayList<Observer>;

    @Override
    public void haveBreakfirst() {

        this.notifyObserver("have breakfast");
    }

    @Override
    public void havaFun() {
        this.notifyObserver("fun");

    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer o:observers){
//            o.update(o, context);
        }

    }
}
