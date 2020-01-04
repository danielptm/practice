package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {


    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        // Initial luckbalance = 0
        // if she wins the contest her luck balance DECREASE by contests[i], if she loses it INCREASES by contests[i]
        //Create Collections from contests.
        //Order the contests by natural order of L[i]
        //Remove k number of the important contests with the lower luck points
        //(Assume she loses the remaining) Sum the luck points of remaining contests.

        List<int[]> adjustedList = sort(contests);

        int sum = 0;
        int kCounter = 0;
        for(int i = 0; i < adjustedList.size(); i++) {
            if (kCounter < k && adjustedList.get(i)[1] == 1) {
                kCounter++;
                sum -= adjustedList.get(i)[0];
            }
        }

        for (int i = 0; i < adjustedList.size(); i++) {
            sum += adjustedList.get(i)[0];
        }
        return sum;
    }

    static List<int[]> sort(int[][] contests) {
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        return Arrays
                .asList(contests)
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
