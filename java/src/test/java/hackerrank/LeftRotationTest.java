package hackerrank;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

public class LeftRotationTest {
    int[] a = new int[]{1,2,3,4,5};

    @Test
    public void test() {
        int d = 2;
        LeftRotation.leftShift(a, d);
//        Assert.assertEquals("[3, 4, 5, 1, 2]", Arrays.toString(result));
    }

    @Test
    public void test2() {
        int d = 4;
        LeftRotation.leftShift(a, d);
    }
}
