package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static int fibonacci(int n) {
        List<Integer> sequence = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i <= n; i++) {
            int twoback = sequence.get(i - 2);
            int oneBack = sequence.get(i - 1);
            int sum = twoback+oneBack;
            sequence.add(sum);
        }
        return sequence.get(sequence.size() - 1);
    }
}
