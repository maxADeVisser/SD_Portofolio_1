public class Triangle extends Shape {

    //Trekanter er repræsenteret ved tre punkter, og har altid en 90 graders vinkel
    private final double X2, Y2, X3, Y3;
    private final double distance1, distance2, distance3;

    //posX, posY & posX2, posY2 != den rette vinkel.
    public Triangle(double posX, double posY, double posX2, double posY2) {
        super(posX, posY);
        this.X2 = posX2;
        this.Y2 = posY2;
        this.X3 = posX;
        this.Y3 = posY2;
        this.distance1 = distanceBetweenTwoPoints(drawPointX,drawPointY,X3,Y3);
        this.distance2 = distanceBetweenTwoPoints(X2,Y2,X3,Y3);
        this.distance3 = distanceBetweenTwoPoints(drawPointX, drawPointY,X2,Y2); //hypotenuse
    }

    //Regner areal ud
    @Override
    public double computeAreal() {
        return (distance1 * distance2)/2;
    }

    //Regner omkreds ud
    @Override
    public double computeCircumference() {
        return distance1 + distance2 + distance3;
    }

    //Regner midterpunktet ud
    @Override
    public void computeCenter() {
        center.setX((drawPointX+X2+X3)/3);
        center.setY((drawPointY +Y2+Y3)/3);
    }

    //Finder trekantens lokation i koordinatsystemet
    @Override
    public boolean checkPoint(double x, double y) { //Formlen fungerer på vilkårlige trekanter (ikke kun retvinklede)
        double w1 = ((drawPointX * (Y3-drawPointY) + (y-drawPointY) * (X3-drawPointX) - x * (Y3-drawPointY)) /
                ((Y2-drawPointY) * (X3 - drawPointX)-(X2 - drawPointX) * (Y3 - drawPointY)));
        double w2 = (y - drawPointY - w1 * (Y2 - drawPointY)) / (Y3 - drawPointY);
        return w1 >= 0 && w2 >= 0 && (w1 + w2) <= 1;
    }
}
