package java_codes.oops.inheritance.single;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Specific to Dog
    }
}
