package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1440036429/
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < prices.length; i++) {
            if (!visited.contains(prices[i])) {
                visited.add(prices[i]);
                for(int j = i; j < prices.length; j++) {
                    if (j > i) {
                        int newp = prices[j] - prices[i];
                        if (newp > max) {
                            max = newp;
                        }
                    }
                }
            }
        }
        return max;
    }
}
