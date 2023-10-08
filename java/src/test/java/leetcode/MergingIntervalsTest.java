package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergingIntervalsTest {
    @Test
    public void testMerge() {
        MergingIntervals mi = new MergingIntervals();
        int[][] input = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = mi.merge(input);
        Assert.assertEquals(Arrays.asList(res).toString(), "[[1,6],[8,10],[15,18]]");
    }
}
