package Fraction;

import Core.Observer;
import Core.Subject;

public class FractionObserver1 implements Observer {

    @Override
    public void update(Subject subject) {
        Fraction fraction = (Fraction) subject;

        if (fraction != null) {
            System.out.println("FractionObserver1: " + subject + " worth now: " + fraction.getNumerator() + "/" + fraction.getDenominator());
        }
    }
}
