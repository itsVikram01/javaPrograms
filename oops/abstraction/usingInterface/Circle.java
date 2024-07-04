package java_codes.oops.abstraction.usingInterface;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Can override the default method if needed
    @Override
    public void printInfo() {
        System.out.println("This is a circle object with radius: " + radius);
    }
}
