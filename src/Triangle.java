public class Triangle extends Shape implements ShapeMethods {

    double X2, Y2, X3, Y3; //triangles are represented as three points, and always have one 90 degree angle
    public Triangle(double posX, double posY, double posX2, double posY2) {
        super(posX, posY);

        this.X2 = posX2;
        this.Y2 = posY2;

        this.X3 = posX;
        this.Y3 = posY2;
    }

    @Override
    public double computeAreal() { //den her er korrekt(Y)
        double distance1 = distanceBetweenTwoPoints(drawPointX,drawPointY,X3,Y3);
        double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);

        return (distance1 * distance2)/2;
    }

    @Override
    public double computeCircumference() { //tjekket at den er korrekt
        double distance1 = Math.sqrt((X2 - drawPointX) * (X2 - drawPointX) + (Y2 - drawPointY) * (Y2 - drawPointY));
        double distance2 = Math.sqrt((X2 - X3) * (X2 - X3) + (Y2 - Y3) * (Y2 - Y3));
        double distance3 = Math.sqrt((X3- drawPointX) * (X3- drawPointX) + (Y3 - drawPointY) * (Y2 - drawPointY));
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
