import static java.lang.Math.PI;

public class Circle extends Shape {

    private final double circleRadius;

    public Circle(double posX, double posY, double r) { //circle constructor
        super(posX, posY);
        this.circleRadius = r;
        this.computeCenter();
    }

    @Override
    public double computeAreal() {
       return PI * circleRadius * circleRadius;
    }

    @Override
    public double computeCircumference() {
        return circleRadius * 2 * PI;
    }

    @Override
    public void computeCenter() {
        center.setX(drawPointX);
        center.setY(drawPointY);
    }

    @Override
    public boolean checkPoint(double pointX, double pointY) {
        double distanceX = pointX-drawPointX;
        double distanceY = pointY-drawPointY;
        return distanceX < circleRadius && distanceY < circleRadius;
    }
}
