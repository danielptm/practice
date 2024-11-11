package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void climbStairsTest() {
        int n = 3;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(3, res);
    }

}
