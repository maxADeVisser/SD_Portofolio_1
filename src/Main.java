

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50,50, 10);
        Circle circle2 = new Circle (50,500,10);
        System.out.println("cir1 areal: " + circle1.computeAreal());
        System.out.println("cir1 omkreds: " + circle1.computeCircumference());
        System.out.println("cir1 computecenter: " + circle1.computeCenter());
        System.out.println("cir1 checkpoint 55,55: " + circle1.checkPoint(55,55));
        System.out.println( "euc dist cir1 og cir2: " + euclideanDistance(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(50,50,10,10);
        System.out.println("rect1 computeCenter: " + rectangle1.computeCenter());
        System.out.println("rect1 checkpoint 60,60: " + rectangle1.checkPoint(60,60));
        System.out.println("euc distance mellem rect1 og cir1: " + euclideanDistance(rectangle1, circle1));

        Triangle triangle1 = new Triangle(10,10,30,30);
        System.out.println("Areal af trekant1: " + triangle1.computeAreal());
        System.out.println("omkreds trekant1: " + triangle1.computeCircumference());
        System.out.println("centerpoint of triangle1: " + triangle1.computeCenter());
    }

    public static double euclideanDistance(Shape s1, Shape s2){
        double distance = Math.sqrt((s2.computeCenter().getX() - s1.computeCenter().getX()) * (s2.computeCenter().getX() - s1.computeCenter().getX())
                + (s2.computeCenter().getY()-s1.computeCenter().getY()) * (s2.computeCenter().getY()-s1.computeCenter().getY()));
        return distance;
    }
}
