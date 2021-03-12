import static java.lang.Math.PI;
import java.lang.Math;

public class Circle extends Shape implements ShapeMethods{

    double circleRadius;

    public Circle(double posX, double posY, double r) { //circle constructor
        super(posX, posY);
        this.circleRadius = r;
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
    public Point computeCenter() { //gør egenligt ikke rigtig noget for en cirkel
        Point circleCenter = new Point(drawPointX, drawPointY);
        return circleCenter;
    }

    @Override
    public boolean checkPoint(double pointX, double pointY) {
        double distanceX = Math.sqrt(pointX- drawPointX)*(pointX- drawPointX); //udregner afstanden fra x-koordinat til x-koordinat
        double distanceY = Math.sqrt(pointY- drawPointY)*(pointY- drawPointY);
        if( distanceX < circleRadius && distanceY < circleRadius){
            return true;
        }
        return false;
    }
}
