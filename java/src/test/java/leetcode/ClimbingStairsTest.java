package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

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
    public void climbStairsTest3() {
        int n = 4;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(5, res);
    }

    @Test
    public void climbStairsTest4() {
        int n = 5;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(8, res);
    }

    @Test
    public void climbStairsTest5() {
        int n = 8;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals(34, res);
    }

    @Test
    public void climbStairsTest6() {
        int n = 35;
        int res = new ClimbingStairs().climbStairs(n);
        Assert.assertEquals('?', res);
    }

//    @Test
//    public void climbStairsTest3() {
//        int n = 35;
//        int res = new ClimbingStairs().climbStairs(n);
//        Assert.assertEquals(2, res);
//    }

    @Test
    public void testGenerate() {
        String res = new ClimbingStairs().generateLeastEfficientPath(3);
        Assert.assertEquals("1:1:1", res);
    }


//    @Test
//    public void testCalculatePaths() {
//        List<String> paths = new ArrayList<>();
//        paths.add("1:1:1");
//        paths.add("1:2");
//        paths.add("2:1");
//        paths.add("2:2:2:2");
//
//        int res = new ClimbingStairs().calculateNumberPaths(paths, 3);
//
//        Assert.assertEquals(3, res);
//    }

    @Test
    public void testSumPaths() {
        String[] pathBits = new String[]{"1", "2"};
        int res = new ClimbingStairs().sumPaths(pathBits);
        Assert.assertEquals(3, res);
    }


    @Test
    public void testPath() {
        String path = "1:1";
        Path p = new Path(path, 2);
        boolean result = p.isEqualsN();
        Assert.assertEquals(true, result);
    }

//    @Test
//    public void testing() {
//        System.out.println(3 / 2);
//    }

    @Test
    public void generateMostEfficientPathTest() {
        int n = 3;
        List<String > res = new ClimbingStairs().mostEfficientPathsAndCombos(n);
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void testCreateOpposite() {
        String x = "21";
        int n = 1;

        ClimbingStairs climbingStairs = new ClimbingStairs();
        String res = climbingStairs.createOppositeForI(n, x);
        Assert.assertEquals("22", res);

    }

    @Test
    public void testGetAllCombos() {
        String x = "222";

        ClimbingStairs climbingStairs = new ClimbingStairs();
        Set<String> res = climbingStairs.getAllCombos(x);
        Assert.assertEquals(8, res.size());

    }

    @Test
    public void testGetAllCombos2() {
        String x = "22";

        ClimbingStairs climbingStairs = new ClimbingStairs();
        Set<String> res = climbingStairs.getAllCombos(x);
        Assert.assertEquals(4, res.size());

    }

    @Test
    public void testGetAllCombos4() {
        String x = "2";

        ClimbingStairs climbingStairs = new ClimbingStairs();
        Set<String> res = climbingStairs.getAllCombos(x);
        Assert.assertEquals(2, res.size());

    }

    @Test
    public void testGetAllCombos3() {
        int x = 4;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        List<String> res = climbingStairs.mostEfficientPathsAndCombos(x);
        Assert.assertEquals(4, res.size());

    }
}
