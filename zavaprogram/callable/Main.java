package java_codes.zavaprogram.callable;

import java_codes.zavaprogram.Circle;
import java_codes.zavaprogram.synchronization.StaticSynchronizedPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        //CallableExample
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit the Callable task to the ExecutorService
        Future<Integer> future = executor.submit(new CallableExample());
        // Get the result from the Future object (blocks until the thread finishes)
        int result = future.get();
        System.out.println("The sum is: " + result);
        executor.shutdown();
    }
}
