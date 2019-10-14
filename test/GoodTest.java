import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodTest {
    Good good = new Good("MILK", 0.50);
    @Test
    void getName() {
        assertEquals("MILK",good.getName(),"Failure in getName");
    }

    @Test
    void setName() {
        assertEquals("MILK", good.getName(),"Failure in setName");
    }

    @Test
    void getNetPrice() {
        assertEquals(0.50, good.getNetPrice(), "Failure in getNetPrice");
    }

    @Test
    void setNetPrice() {
        assertEquals(0.50, good.getNetPrice(),"Failure in setNetPrice");
    }

    @Test
    void grossPrice() {
        assertEquals(0.60, good.grossPrice(),"Failure in grossPrice");
    }

    @Test
    void discount() {
        good.discount(20);
        assertEquals(0.48, good.grossPrice(),"Failure in discount");
    }
}