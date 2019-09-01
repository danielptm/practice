package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class SocksTest {

    @Test
    public void testSocks() {
        int n = 9;
        int[] socks = new int[]{10,20,20,10,10,30,50,10,20};
        //
        int result = Socks.testSocks(n, socks);
        Assert.assertEquals(3, result);
    }
}
