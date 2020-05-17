package daily_problem;

import org.junit.Assert;
import org.junit.Test;

public class Number1Test {

    @Test
    public void testing() {
        int[] items = new int[]{10, 15, 3, 7};
        int k = 17;
        boolean result = calculate(items, k);
        Assert.assertTrue(result);
    }

    boolean calculate(int[] arr, int k) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int b = arr[j];
                result = a + b == k;
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}
