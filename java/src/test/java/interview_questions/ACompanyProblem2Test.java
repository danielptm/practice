package interview_questions;

        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class ACompanyProblem2Test {
    @Test
    public void testing() {
        int days = 1;
        int[] states = new int[]{1, 0, 0, 0, 0, 1, 0, 0};
        ACompanyProblem2 aCompanyProblem2 = new ACompanyProblem2();
        List<Integer> result = aCompanyProblem2.cellCompete(states, days);
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1, 0, 1, 0));
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testing2() {
        int num = 5;
        int[] arr = new int[]{2, 4, 6, 8, 10};
        int expected = 2;
        int result = new ACompanyProblem2().generalizedGCD(num, arr);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testing3() {
        int num = 5;
        int[] arr = new int[]{4, 6, 8, 10};
        int expected = 2;
        int result = new ACompanyProblem2().generalizedGCD(num, arr);
        Assert.assertEquals(expected, result);
    }
}
