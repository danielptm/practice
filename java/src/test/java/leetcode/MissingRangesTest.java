package leetcode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MissingRangesTest {

    @Test
    public void test1() {
        int[] nums = new int[]{0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[2, 4->49, 51->74, 76->99]";

        Assert.assertEquals(expected, result);

    }

    /**
     * Array is empty scenarios
     */
    @Test
    public void test2() {
        int[] nums = new int[0];
        int lower = 1;
        int upper = 1;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[1]";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void test8() {
        int[] nums = new int[0];
        int lower = 0;
        int upper = 9;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[0->9]";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void test3() {
        int[] nums = new int[0];
        int lower = -3;
        int upper = -1;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[-3->-1]";

        Assert.assertEquals(expected, result);

    }

    /**
     * Only item in nums is -1
     */
    @Test
    public void test4() {
        int[] nums = new int[]{-1};
        int lower = -1;
        int upper = -1;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[]";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void test5() {
        int[] nums = new int[]{-1};
        int lower = -2;
        int upper = -1;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[-2]";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void test6() {
        int[] nums = new int[]{-1};
        int lower = -1;
        int upper = 0;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[0]";

        Assert.assertEquals(expected, result);

    }

    @Test
    public void test7() {
        int[] nums = new int[]{-1};
        int lower = -2;
        int upper = 0;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[-2, 0]";

        Assert.assertEquals(expected, result);

    }

    @Ignore
    public void test10() {
        int[] nums = new int[]{-1};
        int lower = -1;
        int upper = 0;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "0";

        Assert.assertEquals(expected, result);
    }


    /**
     * Only item in nums is 0
     */
    @Test
    public void test9() {
        int[] nums = new int[]{0};
        int lower = 0;
        int upper = 9;
        String result =  new MissingRanges().findMissingRanges(nums, lower, upper).toString();
        String expected = "[1->9]";

        Assert.assertEquals(expected, result);
    }



}
