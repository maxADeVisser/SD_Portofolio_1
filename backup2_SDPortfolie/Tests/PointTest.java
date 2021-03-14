import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point testPoint;
    @BeforeEach
    void setUp() {
        testPoint = new Point(10,10);
    }

    @Test
    void testToString() {
        assertEquals(testPoint.toString(),"Point{x=" + 10.0 + ", y=" + 10.0 + "}");
    }

    @Test
    void getX() {
        assertEquals(testPoint.getX(),10);
    }

    @Test
    void getY() {
        assertEquals(testPoint.getY(),10);
    }


    @Test
    void setX() {
        testPoint.setX(50);
        assertEquals(testPoint.getX(),50);
    }

    @Test
    void setY() {
        testPoint.setY(50);
        assertEquals(testPoint.getY(),50);
    }
}