package design_pattens.observer_pattern;

import java.util.Observer;

/**
 * Created by juno on 15-7-24.
 */
public interface Observable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObserver(String context);
}
