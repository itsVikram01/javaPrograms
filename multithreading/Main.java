package java_codes.multithreading;

import java_codes.zavaprogram.Circle;
import java_codes.zavaprogram.callable.CallableExample;
import java_codes.zavaprogram.synchronization.StaticSynchronizedPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        //Multithreading
        Thread thread1 = new Thread(() -> StaticSynchronizedPrinter.printDocument("Doc 1"));
        Thread thread2 = new Thread(() -> StaticSynchronizedPrinter.printDocument("Doc 2"));

        thread1.start();
        thread2.start();

    }
}
