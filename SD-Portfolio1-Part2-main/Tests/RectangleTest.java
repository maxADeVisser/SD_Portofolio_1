import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class RectangleTest {

    private Rectangle testRectangle;

    //Opretter en ny test rektangel med samme form inden hver test
    @BeforeEach
    void setUP(){
        testRectangle = new Rectangle(10,10,50,50);
    }

    //Tester om den oprettede rektangels areal er 2500
    @Test
    void computeAreal() {
        assertEquals(testRectangle.computeAreal(), 2500);
    }

    //Tester om den oprettede rektangels areal er 200
    @Test
    void computeCircumference() {
        assertEquals(testRectangle.computeCircumference(),200);
    }

    //Tester om den oprettede rektangels midtpunkt ligger på 35, 35
    @Test
    void computeCenter() {
        testRectangle.computeCenter();
        assertEquals(testRectangle.center.getX(),35);
        assertEquals(testRectangle.center.getY(),35);
    }

    //Tester om point er korrekt på rektangel
    @Test
    void checkPoint() {
        assertTrue(testRectangle.checkPoint(25, 25));
    }
}