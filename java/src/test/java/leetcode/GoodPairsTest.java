package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest {
    @Test
    public void test_1() {
        int[] nums = new int[]{1,2,3,1,1,3};
        int expected = 4;
        int result = new GoodPairs().numIdenticalPairs(nums);
        Assert.assertEquals(expected, result);
    }
}
