import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    //Opretter et test punkt
    Point testPoint;

    //Før hver test bliver testPoint givet de to samme koordinater
    @BeforeEach
    void setUp() {
        testPoint = new Point(10,10);
    }

    //Tester om toString virker når vi printer
    @Test
    void testToString() {
        assertEquals(testPoint.toString(),"Point{x=" + 10.0 + ", y=" + 10.0 + "}");
    }

    //Tester om get for X virker
    @Test
    void getX() {
        assertEquals(testPoint.getX(),10);
    }

    //Tester om get for Y virker
    @Test
    void getY() {
        assertEquals(testPoint.getY(),10);
    }

    //Tester om set for X virker
    @Test
    void setX() {
        testPoint.setX(50);
        assertEquals(testPoint.getX(),50);
    }

    //Tester om set for Y virker
    @Test
    void setY() {
        testPoint.setY(50);
        assertEquals(testPoint.getY(),50);
    }
}