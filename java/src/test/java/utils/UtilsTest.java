package utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsTest {
    @Test
    public void testing2() {
        int[] nums = new int[]{1, 2, 3};
        int num = 4;
        int[] result = Utils.addItemToArray(num, nums);
        Assert.assertEquals(4, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(4, result[3]);
    }

    @Test
    public void testing3() {
        int[] nums = new int[]{1, 2, 3};
        int index = 1;

        int[] result = Utils.removeItemFromArray(index, nums);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(3, result[1]);
    }

    @Test
    public void testing4() {
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8};
        int index = 3;
        int[] result = Utils.removeItemFromArray(index, nums);
        Assert.assertEquals(6, result[3]);
        List<String> items = new ArrayList<>();
    }


    @Test
    public void testing5() {
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8};
        int num = 3;
        boolean result = Utils.contains(num, nums);
        Assert.assertTrue(result);
        int num2 = 100;
        boolean result2 = Utils.contains(num2, nums);
        Assert.assertFalse(result2);
    }

    @Test
    public void testing6() {
        int num = 2;
        int index = 1;
        int[] items = new int[]{1, 3};
        int[] result = Utils.insertItemAtIndex(index, num, items);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
        Assert.assertEquals(3, result[2]);
    }
}
