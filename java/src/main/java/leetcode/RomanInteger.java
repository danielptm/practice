package leetcode;

import java.util.*;

public class RomanInteger {

    static Map<String, Integer> nums = new HashMap<>();

    static {
        nums.put("I", 1);
        nums.put("V", 5);
        nums.put("X", 10);
        nums.put("L", 50);
        nums.put("C", 100);
        nums.put("D", 500);
        nums.put("M", 1000);
    }


    List<Integer> getNonConsecutiveIndices(String c, int j , String[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = j; i < (nums.length); i++) {
            String curr = nums[i];
            String prev = nums[i - 1];
            if (curr.equals(prev)) {
                //do nothing
            } else if (curr.equals(nums[i])) {
                result.add(i);
            }
        }
        return result;
    }

    public int romanToInt(String s) {
        int result = 0;
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++) {
            String curr = chars[i];
            List<Integer> indices = getNonConsecutiveIndices(curr, i, chars);
            if (indices.size() == 0) {
                result += nums.get(chars[i]);
            } else {
                int toSubtract = 0;
                for (int j = indices.get(0); j < indices.get(1);j ++) {
                     toSubtract += nums.get(chars[j]);
                }
                result -= toSubtract;
                 i = indices.get(1);
            }

        }
        return result;
    }
}
