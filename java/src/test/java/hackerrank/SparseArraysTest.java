package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class SparseArraysTest {

    @Test
    public void testing() {
        String[] strings = new String[]{"aba", "baba", "aba", "xzxb"};
        String[] queries = new String[]{"aba","xzxb", "ab"};
        int[] expected = new int[]{2, 1, 0};

        int[] result = SparseArrays.matchingStrings(strings, queries);

        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
        Assert.assertEquals(expected[1], result[1]);
    }
}
