public class Rectangle {

    double width;
    double heigth;

    public Rectangle (double width, double heigth) {

        setHeight(heigth);
        setWidth(width);
    }
    /**
     * @return The rectangle's area.
     */
    public double getArea() {
        double area= 0;
        area = width* heigth;

        return area; // TODO
    }

    /**
     * @return The rectangle's perimeter.
     */
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = 2*heigth+2*width;
        return perimeter; // TODO
    }

    /**
     * @return The rectangle's width.
     */
    public double getWidth() {

        return width; // TODO
    }
    /**
     * @param width The rectangle's new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return The rectangle's height.
     */
    public double getHeight() {
        return heigth; // TODO
    }

    /**
     * @param height The rectangle's new height
     */
    public void setHeight(double height) {
        this.heigth = height;
    }
}

