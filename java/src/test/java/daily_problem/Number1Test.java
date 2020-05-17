package daily_problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Number1Test {

    /**
     * This problem was recently asked by Google.
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    @Test
    public void testing() {
        int[] items = new int[]{10, 15, 3, 7};
        int k = 17;
        boolean result = calculate(items, k);
        Assert.assertTrue(result);
    }

    @Test
    public void testing2() {
        int[] items = new int[]{10, 15, 3, 7};
        int k = 17;
        boolean result = calculate2(items, k);
        Assert.assertTrue(result);
    }

    /**
     * Brute force ... O(N)^2 time
     * @param arr
     * @param k
     * @return
     */
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

    /**
     * O(N)
     * @param arr
     * @param k
     * @return
     */
    boolean calculate2(int[] arr, int k) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.contains(k - arr[i])) {
                return true;
            }
            nums.add(arr[i]);
        }
        return false;
    }

    /**
     * Do this with a binary search
     * @param arr
     * @param k
     * @return
     */
    boolean calculate3(int[] arr, int k) {

        return false;
    }
}
