public class Point {
    private double x;
    private double y;

    public Point (double pointX, double pointY){
        this.x = pointX;
        this.y = pointY;
    }

    //Her gør vi så man får noget læseligt tilbage når man printer point
    @Override
    public String toString() {
        return "Point{" + "x=" + String.format("%,.1f", x) + ", y=" + String.format("%,.1f", y) + '}';
    }

    //Setters og getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
