import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle= new Rectangle(2, 4, 12);
    @Test
    void getWidth() {
        assertEquals(2, rectangle.getWidth(),"Failure in getWidth");
    }

    @Test
    void setWidth() {
        assertEquals(2, rectangle.getWidth(),"Failure in setWidth");
    }

    @Test
    void getHeight() {
        assertEquals(4, rectangle.getHeight(),"Failure in getHeight");
    }

    @Test
    void setHeight() {
        assertEquals(4 , rectangle.getHeight(), "Failure in setHeight");
    }

    @Test
    void getCircumference() {
        assertEquals(12, rectangle.getCircumference(),"Failure in getCircumference");
    }

    @Test
    void setCircumference() {
        assertEquals(12, rectangle.getCircumference(),"Failure in setCircumference");
    }
}