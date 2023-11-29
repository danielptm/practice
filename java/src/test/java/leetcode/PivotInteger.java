package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


//https://leetcode.com/problems/find-the-pivot-integer/
public class PivotInteger {

    public int pivotInteger(int n) {
        Map<Integer, int[]> sums = new HashMap<>();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                }
            }
        }
        return 1;
    }

    @Test
    public void test1() {
        int n = 8;
        int expected = 6;
        int result = pivotInteger(n);
        Assert.assertEquals(expected, result);
    }
}
