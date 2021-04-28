import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Opretter en cirkel og et rektangel der kan testes på
    Circle testCirlce = new Circle (30,30,25);
    Rectangle testRectangle = new Rectangle(30,100,25,25);

    //Tester om euclidean distance mellem cirklen og rektanglet er 83,44
    @Test
    void euclideanDistance() {
        assertEquals(Main.euclideanDistance(testCirlce,testRectangle),83.44,0.01);
    }
}