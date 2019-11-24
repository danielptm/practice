package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class CountValleysTest {

    @Test
    public void testCountValleys() {
        CountValleys countValleys = new CountValleys(8, "UDDDUDUU");
        Assert.assertEquals(1, countValleys.countValleys());
    }

    @Test
    public void testCountValleys2() {
        CountValleys countValleys = new CountValleys(12, "DDUUDDUDUUUD");
        Assert.assertEquals(2, countValleys.countValleys());
    }

    @Test
    public void testCountValleys3() {
        CountValleys countValleys = new CountValleys(10, "UDUUUDUDDD");
        Assert.assertEquals(0, countValleys.countValleys());
    }

}
