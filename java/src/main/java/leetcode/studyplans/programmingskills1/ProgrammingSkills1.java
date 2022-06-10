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

        List<Double> items = Arrays.stream(s).mapToDouble(i -> (double) i).boxed()
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
}
