package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class FindSubstringTest {

    @Test
    public void testStr() {
        String hs = "hello";
        String nl = "ll";
        int res = new FindSubString().strStr(hs, nl);
        Assert.assertEquals(2, res);
    }

    @Test
    public void testStr2() {
        String hs = "aaa";
        String nl = "a";
        int res = new FindSubString().strStr(hs, nl);
        Assert.assertEquals(0, res);
    }

}
