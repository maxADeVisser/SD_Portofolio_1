public class Rectangle extends Shape implements ShapeMethods{

    double length;
    double height;

    public Rectangle(double posX, double posY, double l, double h) { //constructor. Oprettes med koordinatorne svarende til venstre øvre hjørne
        super(posX, posY);
        this.length = l;
        this.height = h;
    }

    @Override
    public double computeAreal() {
       double rectangleAreal = length * height;
       return rectangleAreal;
    }

    @Override
    public double computeCircumference() {
        double rectangleCircumference = (height + length) * 2;
        return rectangleCircumference;
    }

    @Override
    public Point computeCenter() {
        Point rectangleCenter = new Point(drawPointX +(length/2), drawPointY +(height/2));
        return rectangleCenter;
    }

    @Override
    public boolean checkPoint(double pointX, double pointY) {
        if(pointX > drawPointX && drawPointX + length > pointX && pointY > drawPointY && drawPointY -length < pointY){
            return true;
        }
        return false;
    }


}
