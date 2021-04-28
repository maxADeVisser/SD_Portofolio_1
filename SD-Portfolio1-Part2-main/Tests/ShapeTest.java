import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Triangle testTriangle = new Triangle(10,10,30,30);
    /* er nødt til at instansiere en type af Shape før kan kalde på distanceBetweenTwoPoints-metoden.
    Shape klassen er abstract og kan derfor ikke instansieres
    Hvilken type Shape det er, er arbitræt. Jeg har bare valgt at bruge en trekant her*/

    double point1X = 10;
    double point1Y = 10;
    double point2X = 30;
    double point2Y = 30;

    //Tester om vores trekant fungerer som forventet. Det forventede korrekte svar er "actual" og farjlmargen er "delta"
    @Test
    void distanceBetweenTwoPoints() {
        assertEquals(testTriangle.distanceBetweenTwoPoints(point1X,point1Y,point2X,point2Y), 28.284271, 0.01);
    }
}