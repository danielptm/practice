package random;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumToTarget {


    private int[] sumToTarget(int[] items, int target) {
        int[] result = new int[2];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                if ((items[i] + items[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    @Test
    public void sumToTarget() {
        int[] items = new int[]{1, 6, 2, 4, 8, 3};
        int target = 5;
        int[] result = sumToTarget(items, target);
        Assert.assertEquals(2, result.length);
        int[] expected = new int[]{5, 2};
        Assert.assertTrue(Arrays.equals(expected, result));
    }
}
