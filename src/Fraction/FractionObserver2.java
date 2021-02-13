package Fraction;

import Core.Observer;
import Core.Subject;

public class FractionObserver2 implements Observer {

    @Override
    public void update(Subject subject) {

        Fraction fraction = (Fraction) subject;

        if (fraction != null) {
            System.out.println("FractionObserver2: New values of " + subject + " : num = " + fraction.getNumerator() + ", den = " +
                    fraction.getDenominator());
        }
    }
}
