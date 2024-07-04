package java_codes.oops.abstraction.usingInterface;

public interface Shape {
    double calculateArea(); // Abstract method - needs implementation in implementing class

    default void printInfo() { // Default method with implementation
        System.out.println("This is a shape object.");
    }

    static double calculateTotalArea(Shape[] shapes) { // Static method - can be called directly using interface name
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
