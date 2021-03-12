public class Triangle extends Shape implements ShapeMethods {
<<<<<<< Updated upstream

    double X2, Y2, X3, Y3; //triangles are represented as three points

    public Triangle(int posX, int posY, int posX2, int posY2, int posX3, int posY3) {
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;
        this.X3 = posX3;
        this.Y3 = posY3;
=======
    //vi antager at alle trekanter er retvinklede
    double X2, Y2, X3, Y3; //triangles are represented as three points, and always have one 90 degree angle
    double distance1, distance2, distance3;

    public Triangle(double posX, double posY, double posX2, double posY2) { //constructor
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;
        this.X3 = posX;
        this.Y3 = posY2;
        this.distance1 = distanceBetweenTwoPoints(drawPointX, drawPointY,X3,Y3);
        this.distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        this.distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY, X3,Y3);
>>>>>>> Stashed changes
    }

    @Override
    public double computeAreal() {
<<<<<<< Updated upstream
        double distance1 = Math.sqrt((X2 - xCoordinate) * (X2 - xCoordinate) + (Y2 - yCoordinate) * (Y2 - yCoordinate));
        double distance2 = Math.sqrt((X2 - X3) * (X2 - X3) + (Y2 - Y3) * (Y2 - Y3));
        double triangleAreal = (distance1 * distance2)/2; // dobbelttjek at den her udregning er korrekt haha
        return triangleAreal;
=======
        //double distance1 = distanceBetweenTwoPoints(drawPointX, drawPointY,X3,Y3);
        //double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        return (distance1 * distance2)/2;
>>>>>>> Stashed changes
    }

    @Override
    public double computeCircumference() {
<<<<<<< Updated upstream
        double distance1 = Math.sqrt((X2 - xCoordinate) * (X2 - xCoordinate) + (Y2 - yCoordinate) * (Y2 - yCoordinate));
        double distance2 = Math.sqrt((X2 - X3) * (X2 - X3) + (Y2 - Y3) * (Y2 - Y3));
        double distance3 = Math.sqrt((X3-xCoordinate) * (X3-xCoordinate) + (Y3 - yCoordinate) * (Y2 - yCoordinate));
=======
        //double distance1 = distanceBetweenTwoPoints(drawPointX, drawPointY,X2,Y2);
        //double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        //double distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY, X3,Y3);
>>>>>>> Stashed changes
        return distance1 + distance2 + distance3;
    }

    @Override
    public Point computeCenter() {
        return null;
    }

    @Override
<<<<<<< Updated upstream
    public boolean checkPoint(double x, double y) {
=======
    public boolean checkPoint(double checkX, double checkY) {
        //double distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        //double distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY, X3,Y3);
        if(checkX > drawPointX && drawPointX + distance2 > checkX && checkY > drawPointY && drawPointY - distance3 < checkY){
            return true;
        }

>>>>>>> Stashed changes
        return false;
    }

}
