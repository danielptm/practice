package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * Complete the function twoStrings in the editor below.
 * It should return a string, either YES or NO based on whether the strings share a common substring.
 * twoStrings has the following parameter(s):
 * s1, s2: two strings to analyze .
 */
public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String result = null;

        Map<String, String> map1 = new HashMap<>(s1.length());
        Map<String, String> map2 = new HashMap<>(s2.length());

        String[] list1 = s1.split("");
        String[] list2 = s2.split("");

        for (int i = 0; i < list1.length; i++) {
            map1.putIfAbsent(list1[i], list1[i]);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.putIfAbsent(list2[i], list2[i]);
        }
        for(Map.Entry<String, String> item: map1.entrySet()) {
            if(map2.containsKey(item.getKey())) {
                result = "YES";
                break;
            } else {
                result = "NO";
            }
        }
        return result;
    }
}
