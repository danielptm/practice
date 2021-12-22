package leetcode;

import org.junit.Assert;
import org.junit.Test;

//TODO: Commit this solution to leetcode.
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPefix1() {
        String[] args = new String[]{"flower", "flow", "flight"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(args);
        String expected = "fl";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void longestCommonPefix2() {
        String[] args = new String[]{"dog", "racecar", "car"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(args);
        String expected = "";
        Assert.assertEquals(expected, result);
    }

    //TODO: This test does not pass
    @Test
    public void longestCommonPefix3() {
        String[] args = new String[]{"cir","car"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(args);
        String expected = "c";
        Assert.assertEquals(expected, result);
    }
}
