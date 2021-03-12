import static java.lang.Math.PI;
import java.lang.Math;

public class Circle extends Shape implements ShapeMethods{

    int circleRadius;

    public Circle(int posX, int posY, int r) { //circle constructor
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
        Point circleCenter = new Point(xCoordinate, yCoordinate);
        return circleCenter;
    }

    @Override
    public boolean checkPoint(double pointX, double pointY) {
        double distanceX = Math.sqrt(pointX- xCoordinate)*(pointX- xCoordinate); //udregner afstanden fra x-koordinat til x-koordinat
        double distanceY = Math.sqrt(pointY- yCoordinate)*(pointY- yCoordinate);
        if( distanceX < circleRadius && distanceY < circleRadius){
            return true;
        }
        return false;
    }
}
