package Shape;

public abstract class Shape {

    protected double area;
    protected double perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double perimeter = circle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        Rectangle rectangle = new Rectangle(45, 99);
        double areaRectangle = rectangle.getArea();
        System.out.println("Area Rectangle: " + areaRectangle);
    }
}
