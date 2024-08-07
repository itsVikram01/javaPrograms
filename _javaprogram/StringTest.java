package java_codes._javaprogram;

import java.util.Comparator;

public class StringTest extends Thread implements Runnable {
    public static void main(String[] args) {

        String name = "Alice";
        System.out.println(name.length());

        String str1 = "Hi";
        String str2 = "Hi";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String greeting1 = new String("Welcome");
        String greeting2 = new String("Welcome");
        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1.equals(greeting2));


        String name1 = "Bob";
        String name2 = "bob";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2)); // Output: true

        String original = "Welcome";
        String modified = original.concat(" Home"); // "Welcome Home" (doesn't change original)
        System.out.println(original); // Still "Welcome"
        System.out.println(modified);

        String sentence = "Find the word 'word'";
        int firstIndex = sentence.indexOf("word");
        int lastIndex = sentence.lastIndexOf("word");
        System.out.println(firstIndex); // Output: 9
        System.out.println(lastIndex); // Output: 15

        String text = "MiXeD CaSe";
        String upperCase = text.toUpperCase();
        String lowerCase = text.toLowerCase();
        System.out.println(upperCase); // Output: MIXED CASE
        System.out.println(lowerCase); // Output: mixed case


        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println(reversed);

        /*
            Create an immutable class in Java:
                1. Declare the class as final:
                2. Make fields private and final:
                3. Use a parameterized constructor:
                4. Don't provide setter methods:
                5. Perform deep copy in getters:
        */


        Comparator<Integer> comparator = (a, b) -> a - b;
        System.out.println(comparator.compare(100,20));
    }
    @Override
    public void run() {
        System.out.println("This run() method is from StringTest which overriding the run() method by extending the Thread class or by implementing the Runnable interface");
    }

    /*
        Thread Lifecycle :
            . New
            . Runnable
            . Running
            . Waiting/Blocked
            . Terminated

        Thread Creation :
            1. Extending the Thread class
            2. Implementing the Runnable interface

        Multithreading Challenges :
            . Synchronization :
                coordination of access between multiple threads to shared resources. It's crucial to prevent data races and inconsistencies when multiple threads are working with the same data.

                . Synchronized keyword with method : synchronized ensures that only one thread can execute that method at a time. Other threads trying to access the synchronized method will be blocked until the current thread finishes executing it.
                . Synchronized blocks{} : use a synchronized block to control access to a specific code section within a method. Only one thread can enter the synchronized block at a time.
                . static synchronized : static synchronization is a specific type of synchronization that applies to class-level locks rather than object-level locks used in regular synchronized methods and blocks.

        Deadlock : when two or more threads are waiting for each other's resources, creating a permanent halt.


        final : final keyword is an access modifier which used to apply restrictions on class, methods, and variables.
            . final class can not be inherited.
            . final method can not be overridded.
            . final variable value can not be changed.

        finally{} Block: The finally{} block is an optional block that always executes, regardless of whether an exception occurs or not.

        finalize() method : finalize method in Java is a garbage collection mechanism that allows objects to perform some cleanup tasks before they are removed from memory.
    */

}
