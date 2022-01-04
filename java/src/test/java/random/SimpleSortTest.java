package random;

import org.junit.Assert;
import org.junit.Test;

public class SimpleSortTest {

    @Test
    public void sort() {
        int[] nums = new int[]{3, 4, 1, 2};
        int[] result = new SimpleSort().sort(nums);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
        Assert.assertEquals(3, result[2]);
        Assert.assertEquals(4, result[3]);
    }

    @Test
    public void sort2() {
        int[] nums = new int[]{3, 4, 1, 2};
        int[] result = new SimpleSort().sortRecursive(nums);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
        Assert.assertEquals(3, result[2]);
        Assert.assertEquals(4, result[3]);
    }
}
