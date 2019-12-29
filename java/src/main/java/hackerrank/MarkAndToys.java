package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MarkAndToys {

    /**
     *
     * Complete the function maximumToys in the editor below.
     * It should return an integer representing the maximum number
     * of toys Mark can purchase.
     *
     * @param - an array of ints representing toy prices.
     * @param - the budget, or the amount able to be spent.
     * @return
     */
    static int maximumToys(int[] prices, int k) {
        List<Integer> sortedPrices = sort(prices);
        int accumulatedCost = 0;
        int toyCount = 0;
        for(int i = 0; i < sortedPrices.size(); i++) {
            if ((accumulatedCost + sortedPrices.get(i)) < k) {
                accumulatedCost+= sortedPrices.get(i);
                toyCount++;
            } else {
                break;
            }
        }
        return toyCount;
    }

    static List<Integer> sort(int[] prices) {
        List<Integer> boxed = Arrays.stream(prices)
                .boxed()
                .collect(Collectors.toList());
        Collections.sort(boxed);
        return boxed;
    }
}
