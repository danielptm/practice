package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void testRepeatedString() {
        String text = "aba";
        long n = 10;

        long result =  RepeatedString.repeatedString(text, n);

        Assert.assertEquals(7, result);
    }

    @Test
    public void testRepeatedString2() {
        String text = "a";
        long n = 1000000000000L;

        long result =  RepeatedString.repeatedString(text, n);

        Assert.assertEquals(n, result);
    }

    @Test
    public void testRepeatedString3() {
        String text = "abcac";
        long n = 10;

        long result =  RepeatedString.repeatedString(text, n);

        Assert.assertEquals(4, result);
    }
}
