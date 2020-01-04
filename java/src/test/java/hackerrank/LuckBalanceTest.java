package hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LuckBalanceTest {

    @Test
    public void testing() {
        int k = 2;
        int[][] items = new int[][]{new int[]{5,1}, new int[]{1,1}, new int[]{4,0}};

        int result = LuckBalance.luckBalance(k, items);

        Assert.assertEquals(8, result);
    }

    /**
     * Testing double array, streams and comparator.
     */
    @Test
    public void randomTest() {
        int[][] items = new int[][]{new int[]{2,1}, new int[]{1,1}, new int[]{3,1}};
        List<int[]> objects = LuckBalance.sort(items);
        Assert.assertEquals(objects.get(0)[0], 1);
        Assert.assertEquals(objects.get(1)[0], 2);
        Assert.assertEquals(objects.get(2)[0], 3);
    }
}
