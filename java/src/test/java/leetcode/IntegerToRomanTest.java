package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void test1() {
        int input = 3749;
        String expected = "MMMDCCXLIX";
        String result = new IntegerToRoman().intToRoman(input);
        Assert.assertEquals(expected, result);
    }
}
