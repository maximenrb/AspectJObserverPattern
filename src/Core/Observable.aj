package Core;

import Point.Point;
import Fraction.Fraction;

public aspect Observable extends ObserverPattern {

    // Add class that you want to observe here
    declare parents: Point implements Subject;
    declare parents: Fraction implements Subject;

    // Add pointcut on subject setters call
    public pointcut notifyObservers(Subject subject):
            target(subject) && (execution (* *.set*(..)));
}