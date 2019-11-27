package hackerrank;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TwStringsTest {
    @Test
    public void testing() {
        String s1 = "hello";
        String s2 = "world";
        Assert.assertEquals("YES", TwoStrings.twoStrings(s1, s2));
    }

    @Test
    public void test2() {
        String s1 = "hi";
        String s2 = "world";
        Assert.assertEquals("NO", TwoStrings.twoStrings(s1, s2));
    }
}
