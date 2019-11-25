package hackerrank;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

public class LeftRotationTest {
    int[] a = new int[]{1,2,3,4,5};

    @Test
    public void test() {
        int d = 4;
        int[] result = LeftRotation.rotLeft(a, d);
        Assert.assertEquals("[5, 1, 2, 3, 4]", Arrays.toString(result));
    }

    @Test
    public void testoneLeft() {
        int[] items = LeftRotation.oneLeft(a);
        Assert.assertEquals("[2, 3, 4, 5, 1]", Arrays.toString(items));
    }
}
