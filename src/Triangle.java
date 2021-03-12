public class Triangle extends Shape implements ShapeMethods {
    //vi antager at alle trekanter er retvinklede
    double X2, Y2, X3, Y3; //triangles are represented as three points, and always have one 90 degree angle

    public Triangle(double posX, double posY, double posX2, double posY2) {
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;
        this.X3 = posX;
        this.Y3 = posY2;
    }

    @Override
    public double computeAreal() {
        double distance1 = distanceBetweenTwoPoints(drawPointX, drawPointY,X3,Y3);
        double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        double triangleAreal = (distance1 * distance2)/2; // dobbelttjek at den her udregning er korrekt haha
        return triangleAreal;
    }

    @Override
    public double computeCircumference() {
        double distance1 = distanceBetweenTwoPoints(drawPointX, drawPointY,X2,Y2);
        double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        double distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY, X3,Y3);
        return distance1 + distance2 + distance3;
    }

    @Override
    public Point computeCenter() {
        Point triangleCenter = new Point((drawPointX+X2+X3)/3, (drawPointY +Y2+Y3)/3);
        return triangleCenter;
    }

    @Override
    public boolean checkPoint(double x, double y) {
        
        return false;
    }
}
