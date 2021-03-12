public class Triangle extends Shape implements ShapeMethods {

    double X2, Y2, X3, Y3; //triangles are represented as three points

    public Triangle(double posX, double posY, double posX2, double posY2, double posX3, double posY3) {
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;
        this.X3 = posX3;
        this.Y3 = posY3;
    }

    @Override
    public double computeAreal() {
        double distance1 = Math.sqrt((X2 - xCoordinate) * (X2 - xCoordinate) + (Y2 - yCoordinate) * (Y2 - yCoordinate));
        double distance2 = Math.sqrt((X2 - X3) * (X2 - X3) + (Y2 - Y3) * (Y2 - Y3));
        double triangleAreal = (distance1 * distance2)/2; // dobbelttjek at den her udregning er korrekt haha
        return triangleAreal;
    }

    @Override
    public double computeCircumference() {
        double distance1 = Math.sqrt((X2 - xCoordinate) * (X2 - xCoordinate) + (Y2 - yCoordinate) * (Y2 - yCoordinate));
        double distance2 = Math.sqrt((X2 - X3) * (X2 - X3) + (Y2 - Y3) * (Y2 - Y3));
        double distance3 = Math.sqrt((X3-xCoordinate) * (X3-xCoordinate) + (Y3 - yCoordinate) * (Y2 - yCoordinate));
        return distance1 + distance2 + distance3;
    }

    @Override
    public Point computeCenter() {
        return null;
    }

    @Override
    public boolean checkPoint(double x, double y) {
        return false;
    }

}
