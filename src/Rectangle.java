public class Rectangle extends Shape implements ShapeMethods{

    double length;
    double height;



    //constructor. Oprettes med koordinatorne svarende til venstre øvre hjørne
    public Rectangle(double posX, double posY, double l, double h) {
        super(posX, posY);
        this.length = l;
        this.height = h;
    }

    @Override
    public double computeAreal() { //testet at den virker
       double rectangleAreal = length * height;
       return rectangleAreal;
    }

    @Override
    public double computeCircumference() { //testet at den virker
        double rectangleCircumference = (height + length) * 2;
        return rectangleCircumference;
    }

    @Override
    public Point computeCenter() { //testet at den virker
        Point rectangleCenter = new Point(drawPointX +(length/2), drawPointY +(height/2));
        return rectangleCenter;
    }

    @Override
    public boolean checkPoint(double x, double y) { //testet at den virker
        if(x > drawPointX && drawPointX + length > x && y > drawPointY && drawPointY - height < y){
            return true;
        }
        return false;
    }


}
