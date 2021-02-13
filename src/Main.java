import Fraction.Fraction;
import Fraction.FractionObserver1;
import Fraction.FractionObserver2;

import Point.Point;
import Point.PointObserver1;
import Point.PointObserver2;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= Tests AspectJ Observable Point =======");

        Point point = new Point(1, 1);
        PointObserver1 pointObserver1 = new PointObserver1();
        PointObserver2 pointObserver2 = new PointObserver2();

        System.out.println("[Initialization] Coordinates of the point : " + point.print());
        point.addObserver(pointObserver1);
        point.addObserver(pointObserver2);

        System.out.println("---");
        point.setX(10);

        System.out.println("---");
        point.setY(-5);

        System.out.println("---");
        System.out.println("[Test removeObserver] Remove PointObserver1");
        point.removeObserver(pointObserver1);
        point.setX(12);

        System.out.println();

        System.out.println("======= Tests AspectJ Observable Fraction =======");

        Fraction fraction = new Fraction(1, 2);
        FractionObserver1 fractionObserver1 = new FractionObserver1();
        FractionObserver2 fractionObserver2 = new FractionObserver2();

        System.out.println("[Initialization] Coordinates of the fraction : " + fraction.print());

        fraction.addObserver(fractionObserver1);
        fraction.addObserver(fractionObserver2);

        System.out.println("---");
        fraction.setNumerator(7);

        System.out.println("---");
        fraction.setDenominator(-4);
    }
}
