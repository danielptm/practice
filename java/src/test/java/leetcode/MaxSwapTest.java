package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MaxSwapTest {

    @Test
    public void go1() {
        int input = 2736;
        int expected = 7236;

        int result = new MaxSwap().go(input);
        Assert.assertEquals(expected, result);
    }
}
