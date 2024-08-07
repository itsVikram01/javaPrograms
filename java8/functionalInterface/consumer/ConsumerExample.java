package java_codes.java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumer = (name) -> System.out.println("Hello, " + name + "!");
        consumer.accept("Alice");

    }
}