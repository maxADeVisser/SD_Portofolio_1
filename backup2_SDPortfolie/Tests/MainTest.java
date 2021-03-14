import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Circle testCirlce = new Circle (30,30,25);
    Rectangle testRectangle = new Rectangle(30,100,25,25);

    @Test
    void euclideanDistance() {
        assertEquals(Main.euclideanDistance(testCirlce,testRectangle),83.44,0.01);
    }
}