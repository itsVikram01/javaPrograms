package java_codes.zavaprogram;

public class Circle  extends Shape { // cannot use protected/private access modifier with Child class
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() { // concrete implementation of abstract method by concrete subclass Circle
        return Math.PI * radius * radius;
    }
}
