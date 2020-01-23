package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testing() {
        int num = 3;
        int result = Fibonacci.fibonacci(num);
        Assert.assertEquals(2, result);
    }
}
