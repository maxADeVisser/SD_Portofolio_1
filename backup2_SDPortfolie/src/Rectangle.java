public class Rectangle extends Shape {

    private final double length;
    private final double height;

    //constructor. Oprettes med koordinatorne svarende til venstre øvre hjørne
    public Rectangle(double posX, double posY, double l, double h) {
        super(posX, posY);
        this.length = l;
        this.height = h;
        this.computeCenter();
    }

    @Override
    public double computeAreal() { //testet at den virker
       return length * height;
    }

    @Override
    public double computeCircumference() { //testet at den virker
        return (height + length) * 2;
    }

    @Override
    public void computeCenter() { //testet at den virker
        center.setX(drawPointX + (length/2));
        center.setY(drawPointY +(height/2));
    }

    @Override
    public boolean checkPoint(double x, double y) { //testet at den virker
        return x > drawPointX && drawPointX + length > x && y > drawPointY && drawPointY - height < y;
    }


}
