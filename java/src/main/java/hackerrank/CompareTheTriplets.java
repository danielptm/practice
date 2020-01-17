package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> both = new ArrayList<>(Arrays.asList(0, 0));

        for (int i = 0; i < 3; i++) {
            int aliceScore = a.get(i);
            int bobScore = b.get(i);
            if (aliceScore > bobScore) {
                int score = both.get(0);
                score++;
                both.set(0,score);
            } else if (bobScore > aliceScore) {
                int score = both.get(1);
                score++;
                both.set(1,score);
            }
        }
        return both;
    }

}
