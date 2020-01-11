package hackerrank;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifference {

    /**
     * Complete the minimumAbsoluteDifference function in the editor below. It should return an integer
     * that represents the minimum absolute difference between any pair of elements.
     * @param arr
     * @return
     */
    static int minimumAbsoluteDifference(int[] arr) {
        int lowestMin = Integer.MAX_VALUE;
        List<Integer> orderedInts = Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < orderedInts.size() - 1; i++) {
            int thisIndex = i;
            int nextIndex = i+1;
            int thisDiff = Math.abs(orderedInts.get(i) - orderedInts.get(nextIndex));
            if (thisDiff < lowestMin) {
                lowestMin = thisDiff;
            }
        }

        return lowestMin;
    }
}
