package hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTripletsTest {

    @Test
    public void testing() {
        List<Integer> aliceScores = new ArrayList<>(Arrays.asList(17,28,30));
        List<Integer> bobScores = new ArrayList<>(Arrays.asList(99,16,8));

        List<Integer> both = CompareTheTriplets.compareTriplets(aliceScores, bobScores);

        Assert.assertEquals(new ArrayList<>(Arrays.asList(2, 1)), both);
    }
}
