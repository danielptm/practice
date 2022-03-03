package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void test() {
        int[] nums = new int[]{4,1,2,1,2};
        int res = new SingleNumber().singleNumber(nums);
        Assert.assertEquals(4, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2,2,1};
        int res = new SingleNumber().singleNumber(nums);
        Assert.assertEquals(1, res);
    }
}
