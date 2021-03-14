public class Rectangle extends Shape implements ShapeMethods{

    double length;
    double height;


    //constructor. Oprettes med koordinatorne svarende til venstre øvre hjørne
    public Rectangle(double posX, double posY, double l, double h) {

    public Rectangle(int posX, int posY, double l, double h) { //constructor. Oprettes med koordinatorne svarende til venstre øvre hjørne

        super(posX, posY);
        this.length = l;
        this.height = h;
        this.computeCenter();
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

    public void computeCenter() { //testet at den virker
        center.setX(drawPointX + (length/2));
        center.setY(drawPointY +(height/2));
        //Point rectangleCenter = new Point(drawPointX +(length/2), drawPointY +(height/2));
        //return rectangleCenter;

    public Point computeCenter() {
        Point rectangleCenter = new Point(xCoordinate+(length/2), yCoordinate+(height/2));
        return rectangleCenter;

    }

    @Override
    public boolean checkPoint(double pointX, double pointY) {
        double distanceX = Math.sqrt(pointX- xCoordinate)*(pointX - xCoordinate); //udregner afstanden fra x-koordinat til x-koordinat
        double distanceY = Math.sqrt(pointY- yCoordinate)*(pointY- yCoordinate);

        if(pointX > xCoordinate && xCoordinate + length > pointX && pointY > yCoordinate && yCoordinate-length < pointY){
            return true;
        }
        return false;
    }


}
