import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle testCircle = new Circle (50,50,50);
    private Point circleCenter = new Point(testCircle.drawPointX,testCircle.drawPointY);

    @Test
    void computeAreal() {
        assertEquals(testCircle.computeAreal(),7853.98, 0.01); //delta indikerer hvor præcis den ska være for at være godkendt
    }

    @Test
    void computeCircumference() {
        assertEquals(testCircle.computeCircumference(),314.15,0.01);
    }

    @Test
    void computeCenter() {
        assertEquals(testCircle.center.getX(), testCircle.drawPointX);
        assertEquals(testCircle.center.getY(), testCircle.drawPointY);
    }

    @Test
    void checkPoint() {
        assertTrue(testCircle.checkPoint(5, 50));
        assertFalse(testCircle.checkPoint(50, 101));
        assertFalse(testCircle.checkPoint(101, 50));
        assertTrue(testCircle.checkPoint(50, 99));
        assertTrue(testCircle.checkPoint(50, 5));
    }
}