package leetcode;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
public class BestTimeStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        List<Integer> diffs = new ArrayList<>();
        diffs.add(0);

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (j > i) {
                    int newDiff = prices[j] - prices[i];
                    diffs.add(newDiff);
                }
            }
        }
        Collections.sort(diffs);
        int maxDiff = diffs.get(diffs.size() - 1);

        return maxDiff;
    }
}
