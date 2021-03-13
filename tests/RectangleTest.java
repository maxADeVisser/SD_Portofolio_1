import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class RectangleTest {

    private Rectangle testRectangle;
    @BeforeEach
    void setUP(){
        testRectangle = new Rectangle(10,10,50,50);
    }

    @Test
    void computeAreal() {
        assertEquals(testRectangle.computeAreal(), 2500);
    }

    @Test
    void computeCircumference() {
        assertEquals(testRectangle.computeCircumference(),200);
    }

    @Test
    void computeCenter() {
        assertEquals(testRectangle.center.getX(),35);
        assertEquals(testRectangle.center.getY(),35);
    }

    @Test
    void checkPoint() {
        assertTrue(testRectangle.checkPoint(25, 25));
    }
}