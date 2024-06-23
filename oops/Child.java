package java_codes.oops;


public class Child extends Parent {
    // Method hiding (Static method can not override but its data hiding)
    public static void main(String[] args) {
        System.out.println("Hiding Parent static main(String[] args) method with Parent static main(String[] args) method");
    }
    public static void display() {
        System.out.println("Hiding Parent static display() method with Child static display() method");
    }

    // Overloading
    public static void main(Float[] args) {
        System.out.println("Overloading Parent static main(String[] args) method with Child static main(Float[] args)");
    }
    public static void main() {
        System.out.println("Overloading Child static main(float[] args) method with Child static main() ");
    }

    // Overriding
    @Override
    public void makeSound() {
        System.out.println("Overriding Parent makeSound() method with Child makeSound() method");
    }

}
