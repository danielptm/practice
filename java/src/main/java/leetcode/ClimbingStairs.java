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
        return -1;
    }

     List<String> mostEfficientPathsAndCombos(int n) {
        List<String> paths = new ArrayList<>();
        int dividedTwo = n / 2;

        StringJoiner sb = new StringJoiner("", "", "");
        for (int i = 0; i < dividedTwo; i++) {
            sb.add("2");
        }
        String nString = sb.toString();
        Set<String> combos = getAllCombos(nString);
        paths.addAll(combos);
        return paths;
    }

    Set<String> getAllCombos(String s) {
        Set<String> combos = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String newS = createOppositeForI(i, s);
            combos.add(newS);
            for (int j = 0; j < s.length(); j++) {
                newS = createOppositeForI(j, newS);
                combos.add(newS);
            }
        }
        return combos;
    }

    String createOppositeForI(int i, String s) {
        char[] strings = s.toCharArray();
        if (strings[i] == '2') {
            strings[i] = '1';
        } else if (strings[i] == '1'){
            strings[i] = '2';
        }
        else {
            System.err.println("Error creating opposite");
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < strings.length; j++) {
           sb.append(strings[j]);
        }
        return sb.toString();
    }

    String[] getStringBits(String s) {
        return s.split(":");
    }

    String createString(String[] s) {
        StringJoiner sb = new StringJoiner(":", "", "");
        for (int i = 0; i < s.length; i++) {
            sb.add(s[i]);
        }
        return sb.toString();
    }

    String createString(String s) {
        StringJoiner sb = new StringJoiner(":", "", "");
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            sb.add(c);
        }
        return sb.toString();
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
