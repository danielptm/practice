package leetcode;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/climbing-stairs/
//TODO
/**
 * Do this with a hashmap and a list. With the hashmap store the key as a generated path.
 * The value is an object. The object has a boolean saying if equals n or not.
 * Use the list to store the most recent generated paths that have been stored in the hashmap.
 * Retrieve these most recent ones and get each object from the map, create a new path, value, store it in list, repeat
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        String leastEfficientPath = generateLeastEfficientPath(n);
        List<String> mostEfficientPaths = generateMostEfficientPaths(n);

        Map<String, Path> pathMap = new HashMap<>();
        List<String> paths = new ArrayList<>();

        for (String mostEfficientPath: mostEfficientPaths) {
            pathMap.put(mostEfficientPath, new Path(mostEfficientPath, n));
            paths.add(mostEfficientPath);
        }


        while (!leastEfficientPathExists(paths, leastEfficientPath)) {
            List<String> newPaths = new ArrayList<>();
            for (int i = 0; i < paths.size(); i++) {
                String np1 = paths.get(i) + ":1";
                String np2 = paths.get(i) + ":2";
                if (!stringExists(newPaths, np1) && !stringExists(paths, np1)) {
                    Path path = new Path(np1, n);
                    pathMap.put(np1, path);
                    newPaths.add(np1);
                }
                if (!stringExists(newPaths, np2) && !stringExists(paths, np2)) {
                    Path path = new Path(np2, n);
                    pathMap.put(np2, path);
                    newPaths.add(np2);

                }
            }
            paths = new ArrayList<>();
            paths.addAll(newPaths);
        }
        int res =  sumPaths(pathMap);
        return res;
    }

     List<String> generateMostEfficientPaths(int n) {
        String p = "";
        int dividedTwo = n / 2;
        List<String> mePaths = new ArrayList<>();
        if (dividedTwo == 1) {
            mePaths.add("1");
            mePaths.add("2");
            return mePaths;
        }
        if (n % 2 == 0) {
            StringJoiner sb = new StringJoiner(":", "", "");
            for (int i = 0; i < dividedTwo; i++) {
                sb.add("2");
            }
            p = sb.toString();
            String left = new String(p);
            String right = new String(p);
            left = left.substring(2);
            right = left.substring(0, right.length() - 2);
            left = "1:" + left;
            right = right + ":1";
            String opp = p.replace("2", "1");
            mePaths.add(p);
            mePaths.add(right);
            mePaths.add(left);
            mePaths.add(opp);
        } else {
            // This has the capacity to cause a bug later down the road, because there are 2 equally efficient paths.
            StringJoiner sb = new StringJoiner(":", "", "");
            sb.add("1");
            for (int i = 0; i < dividedTwo; i++) {
                sb.add("2");
                p = sb.toString();
                mePaths.add(p);
            }
            StringJoiner sb2 = new StringJoiner(":", "", "");
            for (int i = 0; i < dividedTwo; i++) {
                sb2.add("2");
            }
            sb2.add("1");
            p = sb2.toString();
            String opp = p.replace("2", "1");
            mePaths.add(opp);
            mePaths.add(p);
        }
        return mePaths;
    }

    List<String> generateMostEfficientOpposite(List<String> n) {
        return n.stream().map(s -> s.replace("2", "1")).collect(Collectors.toList());
    }

    int sumPaths(Map<String, Path> pathMap) {
        int count = 0;
        for(Map.Entry<String, Path> m: pathMap.entrySet()) {
            if (m.getValue().isEqualsN()) {
                count += 1;
            }
        }
        return count;
    }

    String generateLeastEfficientPath(int n ) {
        String paths = "";
        StringJoiner sb = new StringJoiner(":", "", "");
        for (int i = 0; i < n; i++) {
            sb.add("1");
        }
        return sb.toString();
    }

//    int calculateNumberPaths(List<String> paths, int n) {
//        int count = 0;
//        for (String p: paths) {
//            String[] pathBits = p.split(":");
//            int sum = sumPaths(pathBits);
//            if (sum == n) {
//                count += 1;
//            }
//        }
//        return count;
//    }

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

class Path {
    int n;
    private int sum = 0;

    public Path(String path, int n) {
        this.n = n;
        this.sum = sum(path, n);
    }

    public boolean isEqualsN() {
        return this.sum == this.n;
    }

    public int getSum() {
        return this.sum;
    }

    private int sum(String path, int n) {
        int sum = 0;
        try {
            String[] pathBits = path.split(":");
            for (int i = 0; i < pathBits.length; i++) {
                sum += Integer.valueOf(pathBits[i]);
            }
        } catch (Exception e) {
            System.err.println("There was a problem creating the Path");
        }
        return sum;
    }
}
