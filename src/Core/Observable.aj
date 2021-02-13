package Core;

import Point.Point;
import Fraction.Fraction;

public aspect Observable extends ObserverPattern {

    declare parents: Point implements Subject;
    declare parents: Fraction implements Subject;

    // Notify observers on subject setters call
    public pointcut notifyObservers(Subject subject):
            target(subject) && (execution (* *.set*(..)));
}