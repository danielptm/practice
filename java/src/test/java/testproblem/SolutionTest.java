package testproblem;

import interview_questions.Solution;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void solutionTest() {
        int[] items1 = new int[]{1, 12, 15, 26, 38};
        int[] items2 = new int[]{2, 13, 17, 30, 45};

        Solution.getMedian(items1, items2);
    }
}
