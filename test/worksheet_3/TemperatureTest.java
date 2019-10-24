package worksheet_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import worksheet_2.Car;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private Temperature temperature1;
    private Temperature temperature2;
    private double[] arr1 = new double[365];
    private double[] arr2 = new double[365];
    @BeforeEach
    public void beforeEach() {
        //    public Car(String make, int price, int maxSpeed, String colour){
        temperature1 = new Temperature();
        temperature2 = new Temperature();
        arr1[0] = -10;
        arr2[1] = -10;
        arr2[2] = -10;
//        c1 = new Car("Ford", 20000, 150, "blue");
//        c2 = new Car("Toyota", 25000, 160, "green");
    }
    @Test
    void coldest1() {
        int expected = 1;
        int actual = temperature1.coldest(arr1);
        assertEquals(expected,actual,"error in coldest");
    }
    @Test
    void coldest2() {
//        String expected = "2";
        int expected = 2;
        int actual = temperature2.coldest(arr2);
        assertEquals(expected,actual,"error in coldest");
    }
}