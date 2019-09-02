package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class HourglassTest {

    @Test
    public void testing() {
        int[][] input = new int[6][];
        input[0] = new int[]{-9,-9,-9,1,1,1};
        input[1] = new int[]{0,-9,0,4,3,2};
        input[2] = new int[]{-9,-9,-9,1,2,3};
        input[3] = new int[]{0,0,8,6,6,0};
        input[4] = new int[]{0,0,0,-2,0,0};
        input[5] = new int[]{0,0,1,2,4,0};

        Assert.assertEquals(28, Hourglass.hourglassSum(input));



    }
}
