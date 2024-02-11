package Shape;

public class Circle extends Shape {

    private static double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
