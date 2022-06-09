package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayTest {

    @Test
    public void test() {
        SubArray subArray = new SubArray();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = subArray.maxSubArray(nums);
        Assert.assertEquals(6, res);
    }
}
