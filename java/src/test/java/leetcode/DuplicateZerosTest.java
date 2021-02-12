package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateZerosTest {

    @Test
    public void test1() {
        int[] input = new int[]{1,0,2,3,0,4,5,0};
        int[] expected = new int[]{1,0,0,2,3,0,0,4};
        new DuplicateZeros().duplicateZeros(input);
        Assert.assertArrayEquals(expected, input);
    }
}
