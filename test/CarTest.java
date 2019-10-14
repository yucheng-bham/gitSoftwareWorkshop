import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Tesla", 8000, 80, "black");
    @Test
    void getMake() {
        assertEquals("Tesla", car.getMake(),"Failure in getMake");
    }

    @Test
    void setMake() {
        assertEquals("Tesla", car.getMake(), "Failure in setMake");
    }

    @Test
    void getPrice() {
        assertEquals(8000,car.getPrice(),"Failure in getPrice");
    }

    @Test
    void setPrice() {
        assertEquals(8000, car.getPrice(),"Failure in setPrice");
    }

    @Test
    void getMaxSpeed() {
        assertEquals(80, car.getMaxSpeed(),"Failure in getMaxSpeed");
    }

    @Test
    void setMaxSpeed() {
        assertEquals(80, car.getMaxSpeed(), "Failure in setMaxSpeed");
    }

    @Test
    void getColour() {
        assertEquals("black", car.getColour(),"Failure in getColour");
    }

    @Test
    void setColour() {
        assertEquals("black", car.getColour(),"Failure in setColour");
    }


}