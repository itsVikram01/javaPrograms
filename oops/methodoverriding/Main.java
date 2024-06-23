package java_codes.oops.methodoverriding;

import java_codes.oops.methodhiding.Child;
import java_codes.oops.methodhiding.Parent;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound(); // Animal makeSound method

        Cat cat = new Cat();
        cat.makeSound(); // Cat makeSound method : Meow!

        Dog dog = new Dog();
        dog.makeSound(); // Dog makeSound method : Woof!

    }
}
