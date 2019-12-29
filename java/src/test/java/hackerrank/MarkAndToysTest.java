package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {
    @Test
    public void testing() {
        int[] items = new int[]{1,12,5,111,200,1000,10};
        int result = MarkAndToys.maximumToys(items, 50);

        Assert.assertEquals(4, result);
    }
}
