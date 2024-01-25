package Shape;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}
