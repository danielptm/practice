package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test() {
        int[] nums = new int[]{1, 1, 2};
        int res = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assert.assertEquals(2, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        Assert.assertEquals(5, res);
    }
}
