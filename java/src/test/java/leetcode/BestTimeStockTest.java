package leetcode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BestTimeStockTest {
    @Test
    public void test() {
        int[] nums = new int[]{7,1,5,3,6,4};
        int expected = 5;
        int result = new BestTimeStock().maxProfit(nums);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{7,6,4,3,1};
        int expected = 0;
        int result = new BestTimeStock().maxProfit(nums);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] nums = new int[0];
        int expected = 0;
        int result = new BestTimeStock().maxProfit(nums);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{2,4,1};
        int expected = 2;
        int result = new BestTimeStock().maxProfit(nums);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void test5() {
        int[] nums = new int[]{1,4,1,4,3,1};
        int expected = 3;
        int result = new BestTimeStock().maxProfit(nums);
        Assert.assertEquals(expected, result);
    }

    @Ignore
    public void test6() {
        int[] nums = new int[12000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i;
        }
        for (int i = 10001; i < 12000; i++) {
            nums[i] = 0;
        }
        int expected = 9999;
        int result = new BestTimeStock().maxProfit(nums);
        System.out.println(result);
        Assert.assertEquals(expected, result);
    }
}
