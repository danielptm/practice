package leetcode;

import java.util.*;

//https://leetcode.com/problems/roman-to-integer/description/
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



    public int romanToInt(String s) {
        int result = 0;
        String[] chars = s.split("");
        int l = chars.length - 2;

        result += nums.get(chars[chars.length - 1]);
        for (int i = l; i >= 0; i--) {
            int prevI = i + 1;
            String thisC = chars[i];
            String prevC = chars[prevI];
            int thisVal = nums.get(thisC);
            int prevVal = nums.get(prevC);
            if (thisVal < prevVal) {
                result -= thisVal;
            } else {
                result += thisVal;
            }

        }

        return result;
    }
}
