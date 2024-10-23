package leetcode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class RomanIntegerTest {

    @Test
    public void romanToInt1() {
        String input = "III";
        int expected = 3;
        int res = new RomanInteger().romanToInt(input);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void romanToInt2() {
        String input = "LVIII";
        int expected = 58;
        int res = new RomanInteger().romanToInt(input);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void romanToInt3() {
        String input = "MCMXCIV";
        int expected = 1994;
        int res = new RomanInteger().romanToInt(input);
        Assert.assertEquals(expected, res);
    }
}
