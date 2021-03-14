public abstract class Shape implements ShapeMethods { //Shape superclass
    //indicating the drawpoint which every shape has
    double drawPointX;
    double drawPointY;
    Point center = new Point(0,0);

    int xCoordinate;
    int yCoordinate;

    public Shape(int posX, int posY){ //constructor
        this.xCoordinate = posX;
        this.yCoordinate = posY;
    }
}



