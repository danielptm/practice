import leetcode.BuyAndSellStock;
import org.junit.Assert;
import org.junit.Test;

public class BuyAndSellStockTest {

    @Test
    public void test1() {
        int[] nums = new int[]{7,1,5,3,6,4};
        int res = new BuyAndSellStock().maxProfit(nums);
        int expected = 5;
        Assert.assertEquals(expected, res);
    }
}
