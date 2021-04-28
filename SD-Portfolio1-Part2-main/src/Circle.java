import static java.lang.Math.PI;

public class Circle extends Shape {

    private final double circleRadius;

    //posX og posY = center punkt.
    public Circle(double posX, double posY, double r) {
        super(posX, posY);
        this.circleRadius = r;
    }

    //Regner areal ud
    @Override
    public double computeAreal() {
       return PI * circleRadius * circleRadius;
    }

    //Regner omkreds ud
    @Override
    public double computeCircumference() {
        return circleRadius * 2 * PI;
    }

    //Regner midterpunktet ud
    @Override
    public void computeCenter() {
        center.setX(drawPointX);
        center.setY(drawPointY);
    }

    //Regner cirklens lokation i koordinatsystemet ud
    @Override
    public boolean checkPoint(double pointX, double pointY) {
        double distanceX = pointX-drawPointX;
        double distanceY = pointY-drawPointY;
        return distanceX < circleRadius && distanceY < circleRadius;
    }
}
