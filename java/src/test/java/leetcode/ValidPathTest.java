package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ValidPathTest {



    @Test
    public void testIsAtEnd() {
        int x = 3;
        int y = 3;
        int[][] grid = new int[][]{new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}};
        boolean result = new ValidPath().isAtEnd(grid, x, y);
        Assert.assertEquals(true, result);

        x = 3;
        y = 2;

        grid = new int[][]{new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}};

        boolean result2 = new ValidPath().isAtEnd(grid, x, y);
        Assert.assertEquals(true, result2);
    }

    @Test
    public void testIsLeading() {
        ValidPath validPath = new ValidPath();
        Map<Integer, int[][]> mapping = validPath.getMapping();
        int[][] grid = new int[][]{new int[]{2,4,3}, new int[]{6,5,2}};

        int currX = 0;
        int currY = 1;

        int nextX = 1;
        int nextY = 1;

        boolean result2 = new ValidPath().isLeading(mapping, grid, currX, currY, nextX, nextY);
        Assert.assertEquals(true, result2);
    }

    @Test
    public void mapping() {
        ValidPath validPath = new ValidPath();
        Map<Integer, int[][]> mapping = validPath.getMapping();


    }

}
