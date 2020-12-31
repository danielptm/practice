package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class DefangIpTest {
    @Test
    public void test() {
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        String result = new DefangIp().defangIPaddr(address);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2() {
        String address = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        String result = new DefangIp().defangIPaddr(address);
        Assert.assertEquals(expected, result);
    }
}
