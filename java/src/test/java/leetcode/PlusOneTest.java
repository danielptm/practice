package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test() {
        int[] input = new int[]{1, 2, 3};
        int[] res = new PlusOne().plusOne(input);
        Assert.assertEquals(1, res[0]);
        Assert.assertEquals(2, res[1]);
        Assert.assertEquals(4, res[2]);
    }

    @Test
    public void test2() {
        int[] input = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] res = new PlusOne().plusOne(input);
        Assert.assertEquals(9, res[0]);
        Assert.assertEquals(8, res[1]);
        Assert.assertEquals(7, res[2]);

        Assert.assertEquals(6, res[3]);
        Assert.assertEquals(5, res[4]);
        Assert.assertEquals(4, res[5]);

        Assert.assertEquals(3, res[6]);
        Assert.assertEquals(2, res[7]);
        Assert.assertEquals(1, res[8]);
        Assert.assertEquals(1, res[9]);
    }
}
