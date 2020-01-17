package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class SumArrayTest {

    @Test
    public void testing() {
        int[] arr = new int[]{1, 2, 3, 4, 10, 11};
        int result = SumArray.simpleArraySum(arr);

        Assert.assertEquals(31, result);
    }
}
