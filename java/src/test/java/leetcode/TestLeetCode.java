package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode {

    @Test
    public void twoSum() {

        int[] given = new int[]{2, 7, 11, 15};

        int target = 9;

        int[] items =  LeetCode.twoSum(given, target);

        Assert.assertEquals(9, given[items[0]] + given[items[1]]);


        int target2 = 26;
        int[] items2 =  LeetCode.twoSum(given, target2);

        Assert.assertEquals(target2, given[items2[0]] + given[items2[1]]);

    }

    @Test
    public void twoSumTest2() {

        int[] given = new int[]{3, 3};

        int target = 6;

        int[] items =  LeetCode.twoSum(given, target);

        Assert.assertEquals(6, given[items[0]] + given[items[1]]);

//
//        int target2 = 26;
//        int[] items2 =  LeetCode.twoSum(given, target2);
//
//        Assert.assertEquals(target2, given[items2[0]] + given[items2[1]]);

    }

    @Test (expected = IllegalArgumentException.class)
    public void twoSumThrowException() {
        int[] given = new int[]{2, 7, 11, 15};

        int[] items = LeetCode.twoSum(given, 137);
    }

    @Test
    public void reverse() {
        int firstInput = 123;
        int secondInput = -123;
        int thirdInput = 120;
        Assert.assertEquals(321, LeetCode.reverse(firstInput));
        Assert.assertEquals(-321, LeetCode.reverse(secondInput));
        Assert.assertEquals(21, LeetCode.reverse(thirdInput));
    }


}
