package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void test() {
        int[] nums = new int[]{1,1,2};
        int res = new RemoveDuplicates().removeDuplicates(nums);
        Assert.assertEquals(2, res);
    }
}
