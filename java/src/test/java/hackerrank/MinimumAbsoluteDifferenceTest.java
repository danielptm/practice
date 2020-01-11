package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAbsoluteDifferenceTest {

    @Test
    public void basicTest() {
        int[] arr = new int[]{1, 2, 4, 10};
        int expected = 1;
        int result = MinimumAbsoluteDifference.minimumAbsoluteDifference(arr);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testing() {
        int[] arr = new int[]{3, -7, 0};
        int expected = 3;
        int result = MinimumAbsoluteDifference.minimumAbsoluteDifference(arr);
        Assert.assertEquals(expected, result);
    }
}
