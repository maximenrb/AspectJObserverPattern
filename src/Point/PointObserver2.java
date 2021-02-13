package Point;

import Core.Observer;
import Core.Subject;

public class PointObserver2 implements Observer {

    @Override
    public void update(Subject subject) {
        Point point = (Point) subject;

        if (point != null) {
            System.out.println("PointObserver2: New coordinates of " + subject + " : x = " + point.getX() + ", y = " + point.getY());
        }
    }
}
