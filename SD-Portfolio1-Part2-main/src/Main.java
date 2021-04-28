public class Main {
    public static void main(String[] args) {
        //Circles
        Circle circle1 = new Circle(50,50, 5);
        Circle circle2 = new Circle (50,500,10);
        System.out.println("Cir1 Areal:                 " + String.format("%,.2f", circle1.computeAreal())); //String.format for at afrunde til 2 decimaler
        System.out.println("Cir1 Omkreds:               " + String.format("%,.2f", circle1.computeCircumference()));
        circle1.computeCenter();
        System.out.println("Cir1 Center:                " + circle1.center);
        System.out.println("Cir1 Checkpoint (101, 50):  " + circle1.checkPoint(101,50));
        System.out.println("Cir1 og Cir2 Euc Dist:      " + String.format("%,.2f", euclideanDistance(circle1, circle2)));

        //Rectangles
        Rectangle rectangle1 = new Rectangle(50,50,10,10);
        System.out.println("Rect1 Areal:                " + String.format("%,.2f", rectangle1.computeAreal()));
        System.out.println("Rect1 Omkreds:              " + String.format("%,.2f", rectangle1.computeCircumference()));
        rectangle1.computeCenter();
        System.out.println("Rect1 Center:               " + rectangle1.center);
        System.out.println("Rect1 Checkpoint (60, 60):  " + rectangle1.checkPoint(51,51));
        System.out.println("Rect1 og Cir1 Euc Dist:     " + String.format("%,.2f", euclideanDistance(rectangle1, circle1)));

        //Triangles
        Triangle triangle1 = new Triangle(10,10,30,30);
        System.out.println("Tri1 Areal:                 " + String.format("%,.2f", triangle1.computeAreal()));
        System.out.println("Tri1 Omkreds:               " + String.format("%,.2f", triangle1.computeCircumference()));
        triangle1.computeCenter();
        System.out.println("Tri1 Center:                " + triangle1.center);
        System.out.println("Tri1 Checkpoint (15, 15):   " + triangle1.checkPoint(15,15));
        System.out.println("Tri1 Checkpoint (1, 11):    " + triangle1.checkPoint(1,11));
        System.out.println("Tri1 og Cir1 Euc Dist:      " + String.format("%,.2f", euclideanDistance(triangle1, circle1)));
    }

    //metode til at regne distance fra en shape til en anden shape. Den tager udgangspunkr i en shapes midterpunkt
    public static double euclideanDistance(Shape s1, Shape s2){
        s1.computeCenter();
        s2.computeCenter();
        return Math.sqrt((s2.center.getX() - s1.center.getX()) * (s2.center.getX() - s1.center.getX())
                + (s2.center.getY()-s1.center.getY()) * (s2.center.getY()-s1.center.getY()));
    }
}
