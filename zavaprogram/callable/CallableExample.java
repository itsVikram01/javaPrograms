package java_codes.zavaprogram.callable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Simulate some work and return a result
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}
