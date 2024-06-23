package java_codes.zavaprogram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());


        //CallableExample

        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit the Callable task to the ExecutorService
        Future<Integer> future = executor.submit(new CallableExample());
        // Get the result from the Future object (blocks until the thread finishes)
        int result = future.get();
        System.out.println("The sum is: " + result);
        executor.shutdown();


        //Multithreading
        Thread thread1 = new Thread(() -> StaticSynchronizedPrinter.printDocument("Doc 1"));
        Thread thread2 = new Thread(() -> StaticSynchronizedPrinter.printDocument("Doc 2"));

        thread1.start();
        thread2.start();

    }
}
