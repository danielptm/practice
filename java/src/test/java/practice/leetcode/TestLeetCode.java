package practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode {

    @Test
    public void twoSum() {

        int[] given = new int[]{2, 7, 11, 15};

        int target = 9;

        int[] items =  LeetCode.twoSum(given, target);

        Assert.assertEquals(9, given[items[0]] + given[items[1]]);
    }


}
