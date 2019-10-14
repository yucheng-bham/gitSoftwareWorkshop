/**
 *
 * A class Rectangle with the three field variables width, height, and circumference
 * However, the circumference is affected by either of width change or height change
 * according to the formation : circumference = 2 * (width + height)
 * Thus, the improved code is to revise the circumference once either width or height
 * has changed;
 *
 * @version 2019-10-09
 * @author Yu Cheng
 *
 *
 */
public class Rectangle {
    private double width;
    private double height;
    private double circumference;

    /**
     *
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     * @param circumference The circumference of the rectangle as 2 times the the
     *                      width plus the height
     */

    public Rectangle(double width, double height, double circumference) {
        this.width = width;
        this.height = height;
        this.circumference = circumference;
    }

    /**
     * Getter for the width
     * @return The width of the rectangle is returned.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter for the width. The width and circumference of the rectangle are updated
     * @param width The new width of updated rectangle
     */
    public void setWidth(double width) {
        this.width = width;
        this.circumference = 2 * (width * height);
    }

    /**
     * Getter for the height
     * @return The height of the rectangle is returned
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter for the height. The height and circumference of the rectangle are updated
     * @param height The new height fo updated rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
        this.circumference = 2 * (height * width);
    }

    /**
     * Getter fot the circumference.
     * @return The circumference of the rectangle is returned.
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Setter for the circumference. The circumference of the
     * rectangle is updated.
     * @param circumference The new circumference of the updated rectangle.
     */
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    /**
     *
     * @return A huaman readable description of the rectangle in form
     *         of the three field variables specifying it.
     */
    @Override
    public String toString() {
        return "The rectangle has a width of " + width +
                ", a height of " + height +
                ", and an circumference of " + circumference +
                '.';
    }

    /**
     * main method with a test of the setHeight setter and the toString method
     * @param args
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4, 12);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }


}
