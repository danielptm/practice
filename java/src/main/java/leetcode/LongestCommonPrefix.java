package leetcode;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        List<String> words = Arrays.asList(strs)
                .stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());


        String shortString = words.get(0);

        for (int i = 0; i < shortString.length(); i++) {
            String currentChar = String.valueOf(shortString.charAt(i));

            for (int j = 0; j < words.size(); j++) {
                if (!String.valueOf(words.get(j).charAt(i)).equals(currentChar)) {
                    return result;
                }
                if (j == (words.size() - 1)) {
                    result += currentChar;
                }
            }
        }

        return result;
    }
}










