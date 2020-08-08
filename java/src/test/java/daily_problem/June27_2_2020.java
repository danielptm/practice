package daily_problem;

import org.junit.Assert;
import org.junit.Test;

public class June27_2_2020 {

    @Test
    public void testing() {
        byte num = 0b1111;
        byte expected = 0b0000;

        int result = reverse(num);

        System.out.println("num: " + Integer.toBinaryString(num));
        System.out.println("result: " + Integer.toBinaryString(result));
        Assert.assertEquals(Integer.toBinaryString(expected), Integer.toBinaryString(result));
    }

    int reverse(int num) {
        return ~num;
    }
}
