package leetcode.binarysearchplan;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchPlanTest {
    @Test
    public void testSearch() {
        BinarySearchPlan binarySearchPlan = new BinarySearchPlan();
        int[] nums = new int[]{-1,0,3,5,9,12};
        int s = 9;
        int res = binarySearchPlan.search(nums, s);
        Assert.assertEquals(4, res);
    }

    @Test
    public void testSearch2() {
        BinarySearchPlan binarySearchPlan = new BinarySearchPlan();
        int[] nums = new int[]{-1,0,3,5,9,12};
        int s = 2;
        int res = binarySearchPlan.search(nums, s);
        Assert.assertEquals(-1, res);
    }

    @Test
    public void testSearch3() {
        BinarySearchPlan binarySearchPlan = new BinarySearchPlan();
        int[] nums = new int[]{2, 5};
        int s = 5;
        int res = binarySearchPlan.search(nums, s);
        Assert.assertEquals(1, res);
    }

    @Test
    public void testSearch4() {
        BinarySearchPlan binarySearchPlan = new BinarySearchPlan();
        int[] nums = new int[]{-1, 0, 5};
        int s = 5;
        int res = binarySearchPlan.search(nums, s);
        Assert.assertEquals(2, res);
    }


    @Test
    public void testSearch5() {
        BinarySearchPlan binarySearchPlan = new BinarySearchPlan();
        int[] nums = new int[]{-1,0,5};
        int s = -1;
        int res = binarySearchPlan.search(nums, s);
        Assert.assertEquals(0, res);
    }



    @Test
    public void testGetMiddle() {
        int res = BinarySearchPlan.getMiddleIndex(3, 5);
        Assert.assertEquals(4, res);
    }
}
