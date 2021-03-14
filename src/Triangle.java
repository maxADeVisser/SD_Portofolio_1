public class Triangle extends Shape implements ShapeMethods {

    double X2, Y2, X3, Y3; //triangles are represented as three points

    public Triangle(int posX, int posY, int posX2, int posY2, int posX3, int posY3) {
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;

        this.X3 = posX;
        this.Y3 = posY2;

        this.distance1 = distanceBetweenTwoPoints(drawPointX,drawPointY,X3,Y3);
        this.distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        this.distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY,X2,Y2); //hypotynuse
        this.computeCenter();

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
    public void computeCenter() {
        center.setX((drawPointX+X2+X3)/3);
        center.setY((drawPointY +Y2+Y3)/3);
        //Point triangleCenter = new Point((drawPointX+X2+X3)/3, (drawPointY +Y2+Y3)/3);
        //return triangleCenter;
    }

    @Override
    public boolean checkPoint(double x, double y) { //den virker med vilkårlige trekaner (ikke kun retvinklede)
        double w1 = ((drawPointX * (Y3-drawPointY) + (y-drawPointY) * (X3-drawPointX) - x * (Y3-drawPointY)) /
                ((Y2-drawPointY) * (X3 - drawPointX)-(X2 - drawPointX) * (Y3 - drawPointY)));
        double w2 = (y - drawPointY - w1 * (Y2 - drawPointY)) / (Y3 - drawPointY);
        if(w1 >= 0 && w2 >= 0 && (w1 + w2) <= 1){
            return true;
        }

    public Point computeCenter() {
        return null;
    }

    @Override
    public boolean checkPoint(double x, double y) {

        return false;
    }

}
