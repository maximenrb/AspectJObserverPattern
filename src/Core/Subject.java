package Core;

import java.util.Collection;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    Collection<Observer> getObservers();
}
