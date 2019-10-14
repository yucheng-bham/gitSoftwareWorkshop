/**
 *
 * A class Good with the three field variables name, netPrice, and the static variable
 * VAT_RATE of types String, double and double respectively;
 *
 * @version 2019-10-09
 * @author Yu Cheng
 *
  */
public class Good {
    String name;
    double netPrice;
    final static double VAT_RATE = 0.20;

    /**
     *
     * @param name The name of the Good.
     * @param netPrice The netPrice of the Good.
     */
    public Good(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    /**
     * Getter for the name.
     * @return The name of the Good is returned.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name. The name of the Good is updated.
     * @param name The new name of the updated Good.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the netPrice.
     * @return The netPrice of the Good is returned.
     */
    public double getNetPrice() {
        return netPrice;
    }

    /**
     * Setter for the netPrice. The netPrice of the Good is updated.
     * @param netPrice The new netPrice of the updated Good.
     */
    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    /**
     *
     * @return A human readable description of the Good in form of
     *          two field variables specifying it.
     */
    @Override
    public String toString() {
        return "The " + name +
                " has a gross price of " +
                "\u00A3" + grossPrice() +
                ".";
    }

    /**
     *
     * @return A gross price of the Good when a fixed VAT rate is under consideration.
     */
    public double grossPrice() {
//        this.netPrice = netPrice * (1 + VAT_RATE);
        return this.netPrice * (1 + VAT_RATE);
    }

    /**
     *
     * @param rate The netPrice of the Good is updated.
     */
    public void discount(double rate) {

        this.netPrice = this.netPrice * (100 - rate) / 100;
    }

    /*public static void main(String[] args) {
        Good milk = new Good("milk", 0.50);
        System.out.println(milk);
        milk.discount(20);
        System.out.println(milk);
    }*/


}
