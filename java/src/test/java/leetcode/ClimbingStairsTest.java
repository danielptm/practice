package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairsTest {

    @Test
    public void climbStairsTest() {
        int n = 3;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(3, res);
    }

    @Test
    public void climbStairsTest2() {
        int n = 2;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(2, res);
    }

    @Test
    public void testGenerate() {
        String res = new ClimbingStairs().generateLeastEfficientPath(3);
        Assert.assertEquals("1:1:1", res);
    }


    @Test
    public void testCalculatePaths() {
        List<String> paths = new ArrayList<>();
        paths.add("1:1:1");
        paths.add("1:2");
        paths.add("2:1");
        paths.add("2:2:2:2");

        int res = new ClimbingStairs().calculateNumberPaths(paths, 3);

        Assert.assertEquals(3, res);
    }

    @Test
    public void testSumPaths() {
        String[] pathBits = new String[]{"1", "2"};
        int res = new ClimbingStairs().sumPaths(pathBits);
        Assert.assertEquals(1, res);
    }
}
