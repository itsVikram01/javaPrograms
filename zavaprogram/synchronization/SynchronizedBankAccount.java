package java_codes.zavaprogram.synchronization;

public class SynchronizedBankAccount {
    private int balance;

    public synchronized void withdraw(int amount) {
        // Synchronized method to ensure safe withdrawal
        balance -= amount;
    }
}
