import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class TriangleTest {

    private Triangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new Triangle(10,10,30,30);
    }

    @Test
    void computeAreal() {
        assertEquals(testTriangle.computeAreal(),200);
    }

    @Test
    void computeCircumference() {
        assertEquals(testTriangle.computeCircumference(),68.28, 0.01); //delta indikerer hvor præcis den skal være inde for intervallet af hvad der er rigtigt
    }

    @Test
    void computeCenter() {
        assertEquals(testTriangle.center.getX(), 16.66,0.01);
        assertEquals(testTriangle.center.getY(), 23.33,0.01);
    }

    @Test
    void checkPoint() {
        assertFalse(testTriangle.checkPoint(10, 31));
        assertTrue(testTriangle.checkPoint(15, 20));
        assertTrue(testTriangle.checkPoint(11, 29));
        assertTrue(testTriangle.checkPoint(30, 30));
    }
}