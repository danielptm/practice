package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        List<String> paths = new ArrayList<>();
        String leastEfficientPath = generateLeastEfficientPath(n);

        while (!leastEfficientPathExists(paths, leastEfficientPath)) {
            if (paths.isEmpty()) {
                paths.add("1");
                paths.add("2");
                continue;
            }
            List<String> newPaths = new ArrayList<>();
            for (int i = 0; i < paths.size(); i++) {
                String np1 = paths.get(i) + ":1";
                String np2 = paths.get(i) + ":2";
                if (!stringExists(paths, np1)) {
                    newPaths.add(np1);
                }
                if (!stringExists(paths, np2)) {
                    newPaths.add(np2);
                }
            }
            paths.addAll(newPaths);
        }
        int res = calculateNumberPaths(paths, n);
        return res;
    }

    String generateLeastEfficientPath(int n ) {
        String paths = "";
        StringJoiner sb = new StringJoiner(":", "", "");
        for (int i = 0; i < n; i++) {
            sb.add("1");
        }
        return sb.toString();
    }

    int calculateNumberPaths(List<String> paths, int n) {
        int count = 0;
        for (String p: paths) {
            String[] pathBits = p.split(":");
            int sum = sumPaths(pathBits);
            if (sum == n) {
                count += 1;
            }
        }
        return count;
    }

    int sumPaths(String[] pathBits) {
        int sum = 0;
        for (int i = 0; i < pathBits.length; i++) {
            sum += Integer.valueOf(pathBits[i]);
        }
        return sum;
    }

    boolean stringExists(List<String> list, String s) {
        boolean res = list.stream().filter(i -> i.equals(s)).findFirst().isPresent();
        return res;
    }

    boolean leastEfficientPathExists(List<String> list, String s) {
        boolean res = list.stream().filter(i -> i.equals(s)).findFirst().isPresent();
        return res;
    }
}
