package leetcode.studyplans.programmingskills1;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammingSkills1Test {

    @Test
    public void testCountOdds() {
        int l = 3;
        int h = 7;
        int res = new ProgrammingSkills1().countOdds(l, h);
        Assert.assertEquals(3, res);
    }

    @Test
    public void testCountOdds2() {
        int l = 3;
        int h = 8;
        int res = new ProgrammingSkills1().countOdds(l, h);
        Assert.assertEquals(3, res);
    }

    @Test
    public void testCountOdds3() {
        int l = 1;
        int h = 13;
        int res = new ProgrammingSkills1().countOdds(l, h);
        Assert.assertEquals(7, res);
    }

    @Test
    public void testCountOdds4() {
        int l = 8;
        int h = 10;
        int res = new ProgrammingSkills1().countOdds(l, h);
        Assert.assertEquals(1, res);
    }

    @Test
    public void testAverage() {
        int[] salary = new int[]{4000,3000,1000,2000};
        double expected = 2500.00000;
        double res = new ProgrammingSkills1().average(salary);
        Assert.assertTrue(expected == res);
    }

    @Test
    public void testAverage2() {
        int[] salary = new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double expected = 41111.11111;
        double res = new ProgrammingSkills1().average(salary);
        Assert.assertTrue(expected == res);
    }

    @Test
    public void testHammingWeight() {
        int n = 00000000000000000000000000001011;
        int res = new ProgrammingSkills1().hammingWeight(n);
        Assert.assertEquals(3, res);
    }

    @Test
    public void testSubtractProductAndSum() {
        int n = 234;
        int res = new ProgrammingSkills1().subtractProductAndSum(n);
        Assert.assertEquals(15, res);
    }
}
