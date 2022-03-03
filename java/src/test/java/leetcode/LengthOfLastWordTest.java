package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void test() {
        String w = "Hello World";
        int res = new LengthOfLastWord().lengthOfLastWord(w);
        Assert.assertEquals(5, res);
    }

    @Test
    public void test2() {
        String w = "   fly me   to   the moon  ";
        int res = new LengthOfLastWord().lengthOfLastWord(w);
        Assert.assertEquals(4, res);
    }

    @Test
    public void test3() {
        String w = "luffy is still joyboy";
        int res = new LengthOfLastWord().lengthOfLastWord(w);
        Assert.assertEquals(6, res);
    }
}
