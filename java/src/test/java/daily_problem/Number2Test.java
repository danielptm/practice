package daily_problem;

import org.junit.Assert;
import org.junit.Test;

public class Number2Test {

    @Test
    public void testing() {
        int[] arr2 = new int[]{3, 2, 1};
        int[] result = calculate(arr2);
        Assert.assertEquals(2, result[0]);
        Assert.assertEquals(3, result[1]);
        Assert.assertEquals(6, result[2]);
    }

    @Test
    public void testing2() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] result = calculate2(arr1);
        Assert.assertEquals(120, result[0]);
        Assert.assertEquals(60, result[1]);
        Assert.assertEquals(40, result[2]);
        Assert.assertEquals(30, result[3]);
        Assert.assertEquals(24, result[4]);

    }

    /**
     * This problem was asked by Uber.
     *
     * Given an array of integers, return a new array such that each element at index i of the new array is the
     * product of all the numbers in the original array except the one at i.
     * @param arr
     * @return
     */
    int[] calculate(int[] arr) {
        int length = arr.length;
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            int prod = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                prod *= arr[j];
            }
            newArr[i] = prod;
        }
        return newArr;
    }

    /**
     * Use division and O(N) time
     * @param arr
     * @return
     */
    int[] calculate2(int[] arr) {
        int length = arr.length;
        int[] newArray = new int[length];
        int prod = 1;
        for (int i = 0; i < length; i++) {
            prod *= arr[i];
        }
        for (int i = 0; i < length; i++) {
            newArray[i] = prod / arr[i];
        }
        return newArray;
    }


    /**
     * Do in O(N) time and no division.
     * @param arr
     * @return
     */
    int[] calculate3(int[] arr) {
    return null;
    }
}
