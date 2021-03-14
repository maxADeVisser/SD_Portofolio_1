

public class Main {
    public static void main(String[] args) {
        //circles
        Circle circle1 = new Circle(50,50, 50);
        Circle circle2 = new Circle (50,500,10);
        System.out.println("cir1 areal: " + circle1.computeAreal());
        System.out.println("cir1 omkreds: " + circle1.computeCircumference());
        System.out.println("cir1 computecenter: " + circle1.center);
        System.out.println("cir1 checkpoint: " + circle1.checkPoint(101,50));
        System.out.println( "euc dist cir1 og cir2: " + euclideanDistance(circle1, circle2));

        //rectangles
        Rectangle rectangle1 = new Rectangle(50,50,10,10);
        System.out.println("rect1 computeCenter: " + rectangle1.center);
        System.out.println("rect1 checkpoint 60,60: " + rectangle1.checkPoint(51,51));


        //triangles
        Triangle triangle1 = new Triangle(10,10,30,30);
        System.out.println("Areal af trekant1: " + triangle1.computeAreal());
        System.out.println("omkreds trekant1: " + triangle1.computeCircumference());
        System.out.println("centerpoint of triangle1: " + triangle1.center);
        System.out.println("Checkpoint for triangle1: " + triangle1.checkPoint(15,15));
        System.out.println("Checkpoint for triangle1: " + triangle1.checkPoint(1,11));
        System.out.println(triangle1.center.toString());

    }

    public static double euclideanDistance(Shape s1, Shape s2){
        double distance = Math.sqrt((s2.center.getX() - s1.center.getX()) * (s2.center.getX() - s1.center.getX())
                + (s2.center.getY()-s1.center.getY()) * (s2.center.getY()-s1.center.getY()));
        return distance;
    }
}
