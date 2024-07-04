package java_codes.oops.abstraction.usingInterface;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        System.out.println("Circle 1 Area: " + circle1.calculateArea()); // Calling abstract method through object

        circle1.printInfo(); // Calling default method through object (can be overridden)

        System.out.println("Total Area of both circles: " + Shape.calculateTotalArea(new Shape[]{circle1, circle2})); // Calling static method directly using interface name
    }
}
