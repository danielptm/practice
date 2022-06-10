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
}
