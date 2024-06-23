package java_codes.oops;

public class Parent extends Animal {
    // Data hiding
    public static void main(String[] args) {
        System.out.println("Parent static main(String[] args) method");
    }
    public static void display() {
        System.out.println("Parent class static display() method");
    }

    // Overloading main method
    public static void main(int[] args) {
        System.out.println("Overloading Parent static main(String[] args) method with Parent static main(int[] args)");
    }

    // Overriding
    @Override
    public void makeSound() {
        System.out.println("Overriding Animal makeSound() method with Parent makeSound() method");
    }
}
