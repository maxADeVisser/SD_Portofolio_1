import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    //Opretter en cirkel der kan udføres tests på
    Circle testCircle = new Circle (50,50,50);
    private Point circleCenter = new Point(testCircle.drawPointX,testCircle.drawPointY);

    //Tester om cirklens areal er 7853,98
    @Test
    void computeAreal() {
        assertEquals(testCircle.computeAreal(),7853.98, 0.01); //delta indikerer hvor præcis den ska være for at være godkendt
    }

    //Tester cirklens omkreds
    @Test
    void computeCircumference() {
        assertEquals(testCircle.computeCircumference(),314.15,0.01);
    }

    //Tester hvor cirklens midterpunkt er
    @Test
    void computeCenter() {
        testCircle.computeCenter();
        assertEquals(testCircle.center.getX(), testCircle.drawPointX);
        assertEquals(testCircle.center.getY(), testCircle.drawPointY);
    }

    //Tjekker for om givne punkter er inde i den oprettede cirkel
    @Test
    void checkPoint() {
        assertTrue(testCircle.checkPoint(5, 50));
        assertFalse(testCircle.checkPoint(50, 101));
        assertFalse(testCircle.checkPoint(101, 50));
        assertTrue(testCircle.checkPoint(50, 99));
        assertTrue(testCircle.checkPoint(50, 5));
    }
}