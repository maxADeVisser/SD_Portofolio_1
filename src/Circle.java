import static java.lang.Math.PI;
import java.lang.Math;

public class Circle extends Shape implements ShapeMethods{

    int circleRadius;

    public Circle(int posX, int posY, int r) { //circle constructor
        super(posX, posY);
        this.circleRadius = r;
        this.computeCenter();
    }

    @Override
    public double computeAreal() {
       double circleAreal = PI * circleRadius * circleRadius;
       return circleAreal;
    }

    @Override
    public double computeCircumference() {
        double circleCircumference = circleRadius * 2 * PI;
        return circleCircumference;
    }

    @Override
    public void computeCenter() { //gør egenligt ikke rigtig noget for en cirkel
        center.setX(drawPointX);
        center.setY(drawPointY);
        //Point circleCenter = new Point(drawPointX, drawPointY);
        //return circleCenter;
    }

    public Point computeCenter() { //gør egenligt ikke rigtig noget for en cirkel
        Point circleCenter = new Point(xCoordinate, yCoordinate);
        return circleCenter;
    }

    @Override
    public boolean checkPoint(double pointX, double pointY) { //testet at den virker korrekt
        double distanceX = pointX-drawPointX;
        double distanceY = pointY-drawPointY;

        if( distanceX < circleRadius && distanceY < circleRadius){
            return true;
        }
        return false;
    }
}
