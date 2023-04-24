package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicateNumberTest {

    @Test
    public void testFindDuplicate() {
        int[] input = new int[]{1,3,4,2,2};
        int res = new FindDuplicateNumber().findDuplicate2(input);
        Assert.assertEquals(2, res);
    }

    @Test
    public void testFindDuplicate2() {
        int[] input = new int[]{3,1,3,4,2};
        int res = new FindDuplicateNumber().findDuplicate2(input);
        Assert.assertEquals(3, res);
    }
}
