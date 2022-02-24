package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {

    @Test
    public void test1() {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = new int[]{1,3,5,6};
        int res = searchInsert.searchInsert(nums, 5);
        Assert.assertEquals(2, res);
    }
}
