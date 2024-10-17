package interview_questions;

import org.junit.Assert;
import org.junit.Test;

public class ACompanyProblem4Teset {

    @Test
    public void testFindANumber() {
        new ACompanyProblem4().go("25684");
    }

    @Test
    public void test2() {
        String sequence = new ACompanyProblem4().build(5);
        Assert.assertEquals("0112122", sequence);
        System.out.println(sequence);
    }
}
