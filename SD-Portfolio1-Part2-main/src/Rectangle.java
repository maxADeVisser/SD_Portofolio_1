public class Rectangle extends Shape {

    private final double length;
    private final double height;

    //posX og posY = øvre venstre hjørne af rektanglen.
    public Rectangle(double posX, double posY, double l, double h) {
        super(posX, posY);
        this.length = l;
        this.height = h;
    }

    //Regner areal ud
    @Override
    public double computeAreal() {
       return length * height;
    }

    //Regner omkreds ud
    @Override
    public double computeCircumference() {
        return (height + length) * 2;
    }

    //Regner midterpunktet ud
    @Override
    public void computeCenter() {
        center.setX(drawPointX + (length/2));
        center.setY(drawPointY +(height/2));
    }

    //Finder rektanglens lokation i koordinatsystemet
    @Override
    public boolean checkPoint(double x, double y) {
        return x > drawPointX && drawPointX + length > x && y > drawPointY && drawPointY - height < y;
    }
}
