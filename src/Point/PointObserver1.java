package Point;

import Core.Observer;
import Core.Subject;

public class PointObserver1 implements Observer {

    @Override
    public void update(Subject subject) {
        Point point = (Point) subject;

        if (point != null) {
            System.out.println("PointObserver1: " + subject + " is now at (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
