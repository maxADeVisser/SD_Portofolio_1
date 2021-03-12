public abstract class Shape implements ShapeMethods { //Shape superclass
    int xCoordinate;
    int yCoordinate;

    public Shape(int posX, int posY){ //constructor
        this.xCoordinate = posX;
        this.yCoordinate = posY;
    }
    public double distanceBetweenXPoints(double x1, double x2){
        double distanceX = Math.sqrt((x2 - x1) * (x2 - x1));
        return distanceX;
    }
    public double distanceBetweenYPoints(double y1, double y2){
        double distanceY = Math.sqrt((y2 - y1) * (y2 - y1));
        return distanceY;
    }
}



