package java_codes.zavaprogram;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Thread 1 to print even numbers
        Thread evenThread = new Thread(() -> {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
            }
        });

        // Thread 2 to print odd numbers
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println(i);
            }
        });

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}

