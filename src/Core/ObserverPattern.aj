package Core;

import java.util.ArrayList;
import java.util.Collection;

public abstract aspect ObserverPattern {

    // Notify all observer on pointcut defined in Observable.aj
    public abstract pointcut notifyObservers(Subject subject);
    after(Subject subject) returning : notifyObservers(subject) {
        for (Observer observer : subject.getObservers()) {
            observer.update(subject);
        }
    }


    // Implement Subject attribute and methods
    private final Collection<Observer> Subject.observers = new ArrayList<>();

    public void Subject.addObserver(Observer observer) {
        observers.add(observer);
    }

    public void Subject.removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Collection<Observer> Subject.getObservers() {
        return observers;
    }
}