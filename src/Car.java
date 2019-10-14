/**
 * A class Car with the four field variables make, price, maxSpeed, and the colour of
 * types String, int, int, and String respectively;
 *
 * @version 2019-10-09
 * @author Yu Cheng
 *
 */
public class Car {
    String make;
    int price;
    int maxSpeed;
    String colour;

    /**
     *
     * @param make The make of the car.
     * @param price The price of the car.
     * @param maxSpeed The maxSpeed of the car.
     * @param colour The color of the car.
     */
    public Car(String make, int price, int maxSpeed, String colour) {
        this.make = make;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    /**
     * Getter for the make.
     * @return The make of the car is returned.
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter for the make. The make of the car is updated.
     * @param make The new make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for the price.
     * @return The price of the car is returned.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for the price. The price of the car is updated
     * @param price The new price of the car.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter for the maxSpeed.
     * @return The maxSpeed of the car is returned.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Setter for the maxSpeed. The maxSpeed of the car is updated.
     * @param maxSpeed The new maxSpeed of the car.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Getter for the colour.
     * @return The colour of the car is returned.
     */
    public String getColour() {
        return colour;
    }

    /**
     * Setter for the colour. The colour of the car is updated.
     * @param colour The new colour of the car.
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     *
     * @return A human readable description of the car in form of
     *          the four field variables specifying it.
     */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
