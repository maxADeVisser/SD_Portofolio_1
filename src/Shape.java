public abstract class Shape implements ShapeMethods { //Shape superclass
    //indicating the drawpoint which every shape has
    double xCoordinate;
    double yCoordinate;

    public Shape(double posX, double posY){ //constructor
        this.xCoordinate = posX;
        this.yCoordinate = posY;
    }
}



