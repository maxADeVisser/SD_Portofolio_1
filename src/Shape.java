public abstract class Shape implements ShapeMethods { //Shape superclass
    //indicating the drawpoint which every shape has
    double drawPointX;
    double drawPointY;
    Point center = new Point(0,0);

    public Shape(double posX, double posY){ //constructor
        this.drawPointX = posX;
        this.drawPointY = posY;
    }
    public double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }
}



