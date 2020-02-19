package threading;

import org.junit.Test;

public class FutureWorkTest {
    @Test
    public void testing() {
        int result = multiply(1);
        System.out.println(result);
    }

    int multiply(int num1) {
        if (num1 > 20) {
            return num1;
        } else {
            int newNum1 = num1 * 2;
            return multiply(newNum1);
        }
    }
}
