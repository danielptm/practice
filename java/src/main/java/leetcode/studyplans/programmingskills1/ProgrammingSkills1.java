package leetcode.studyplans.programmingskills1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammingSkills1 {

    public int countOdds(int low, int high) {
        if ((high - low + 1) % 2 == 0) {
            return ((high - low) + 1) / 2;
        } else if ((high - low + 1) % 2 != 0) {
            if ((low % 2 != 0) && (high % 2 != 0)) {
                return (((high - low) / 2) + 1);
            } else {
                return (((high - low) / 2));
            }
        }
        return - 1;
    }

    public Double average(int[] s) {

        List<Double> items = Arrays.stream(s)
                .mapToDouble(i -> (double) i).boxed()
                .collect(Collectors.toList());
        Collections.sort(items);

        Double max = items.get(items.size() - 1);
        Double min = items.get(0);
        Double res = items.stream()
                .filter(i -> i != max && i != min)
                .reduce((i,j) -> i + j)
                .get();
        res = (res / (items.size() - 2));
        String sres = String.format("%.5f", res);
        return Double.valueOf(sres);
    }

    // https://leetcode.com/problems/number-of-1-bits/
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        String ns = Integer.toBinaryString(n);
        for (int i = 0; i < ns.length(); i++) {
            String c = String.valueOf(ns.charAt(i));
            if (c.equals("1")) {
                res++;
            }
        }
        return res;
    }

    public int subtractProductAndSum(int n) {
        List<Integer> nums = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(i -> Integer.valueOf(i)).boxed().collect(Collectors.toList());
        int product = nums.stream().reduce((i,j) -> i * j).get();
        int sum = nums.stream().reduce((i,j) -> i + j).get();
        return product - sum;
    }

    //https://leetcode.com/problems/largest-perimeter-triangle/
    public int largestPerimeter(int[] nums) {
        return -1;
    }
}
