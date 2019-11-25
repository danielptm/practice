package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class CountValleysTest {

    @Test
    public void testCountValleys() {
        int n = 8;
        String s = "UDDDUDUU";
        Assert.assertEquals(1, CountValleys.countValleys(n, s));
    }

    @Test
    public void testCountValleys2() {
        int n = 12;
        String s  = "DDUUDDUDUUUD";
        Assert.assertEquals(2, CountValleys.countValleys(n, s));
    }

    @Test
    public void testCountValleys3() {
        int n = 10;
        String s = "UDUUUDUDDD";
        Assert.assertEquals(0, CountValleys.countValleys(n, s));
    }

}
