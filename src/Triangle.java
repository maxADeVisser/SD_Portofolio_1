public class Triangle extends Shape implements ShapeMethods {

    //triangles are represented as three points, and always have one 90 degree angle
    double X2, Y2, X3, Y3;
    double distance1, distance2, distance3;

    //constructor. Oprettes med udgangspunkt i drawPointX og drawPointY samt to yderligere koordinater
    public Triangle(double posX, double posY, double posX2, double posY2) {
        super(posX, posY);

        this.X2 = posX2;
        this.Y2 = posY2;

        this.X3 = posX;
        this.Y3 = posY2;

        this.distance1 = distanceBetweenTwoPoints(drawPointX,drawPointY,X3,Y3);
        this.distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        this.distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY,X2,Y2); //hypotynuse
    }

    @Override
    public double computeAreal() { //den her er korrekt(Y)
        return (distance1 * distance2)/2;
    }

    @Override
    public double computeCircumference() { //den her er korrekt
        return distance1 + distance2 + distance3;
    }

    @Override
    public Point computeCenter() {
        Point triangleCenter = new Point((drawPointX+X2+X3)/3, (drawPointY +Y2+Y3)/3);
        return triangleCenter;
    }

    @Override
    public boolean checkPoint(double x, double y) { //den virker med vilkårlige trekaner (ikke kun retvinklede)
        double w1 = ((drawPointX * (Y3-drawPointY) + (y-drawPointY) * (X3-drawPointX) - x * (Y3-drawPointY)) /
                ((Y2-drawPointY) * (X3 - drawPointX)-(X2 - drawPointX) * (Y3 - drawPointY)));
        System.out.println("w1: " + w1);
        double w2 = (y - drawPointY - w1 * (Y2 - drawPointY)) / (Y3 - drawPointY);
        System.out.println("w2: " + w2);

        if(w1 >= 0 && w2 >= 0 && (w1 + w2) <= 1){
            return true;
        }
        return false;
    }
}
