package daily_problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class May312022 {

    private static class SparseArray {
        private Map<Integer, Integer> nums = new HashMap<>();

        private SparseArray() {

        }

        public static SparseArray init(int[] arr, int size) {
            SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < size; i++) {
                if (arr[i] != 0) {
                    sparseArray.nums.put(i, arr[i]);
                }
            }
            return sparseArray;
        }

        public void set(int i, int val) {
            if (val != 0) {
                nums.put(i, val);
            }
        }

        public int get(int i) {
            Integer result = nums.get(i);
            if (result == null) {
                return 0;
            } else {
                return result;
            }
        }
    }

    /**
     * You have a large array with most of the elements as zero.
     *
     * Use a more space-efficient data structure, SparseArray, that implements the same interface:
     *
     * init(arr, size): initialize with the original large array and size.
     * set(i, val): updates index at i with val.
     * get(i): gets the value at index i.
     */

    @Test
    public void testSparseArray() {
        int[] items = new int[]{0, 0, 0, 0, 0, 1, 2};
        SparseArray sparseArray = SparseArray.init(items, items.length);
        sparseArray.set(7, 3);
        Assert.assertEquals(0, sparseArray.get(0));
        Assert.assertEquals(0, sparseArray.get(1));
        Assert.assertEquals(0, sparseArray.get(2));
        Assert.assertEquals(0, sparseArray.get(3));
        Assert.assertEquals(0, sparseArray.get(4));
        Assert.assertEquals(1, sparseArray.get(5));
        Assert.assertEquals(2, sparseArray.get(6));
        Assert.assertEquals(3, sparseArray.get(7));
    }
}
