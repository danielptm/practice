package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test() {
        String a = "11";
        String b = "1";
        String expected = "100";

        String res = new AddBinary().addBinary(a, b);

        Assert.assertEquals(expected, res);

    }
}
