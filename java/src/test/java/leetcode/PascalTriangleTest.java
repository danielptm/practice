package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PascalTriangleTest {
    @Test
    public void generate1() {
        int input = 5;
        String expected = "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]";
        List<List<Integer>> result = new PascalTriangle().generate(input);
        String sRes = result.toString();
        Assert.assertEquals(expected, sRes);
    }
}
