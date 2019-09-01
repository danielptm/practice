package hackerrank;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CloudsTest {

    @Test
    public void testJumpOnClouds() {
        int[] input = new int[]{0,0,1,0,0,1,0};
        int result = Clouds.jumpingOnClouds(input);
        Assert.assertEquals(4, result);

    }

    @Test
    public void testJumpOnClouds2() {
        int[] input2 = new int[]{0,0,0,0,1,0};
        int result2 =  Clouds.jumpingOnClouds(input2);
        Assert.assertEquals(3, result2);

    }

    @Test
    public void testJumpOnClouds3() {
        int[] input3 = new int[]{0,1,0,0,0,1,0};
        int result3 = Clouds.jumpingOnClouds(input3);
        Assert.assertEquals(3, result3);

    }

    @Test
    public void testJumpOnClouds4() {
        int[] input4 = new int[]{0,0,0,1,0,0};
        int result4 = Clouds.jumpingOnClouds(input4);


    }


}
