package leetcode;

import java.util.HashMap;
import java.util.Map;

//TODO: Not done
//https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {

    static Map<Integer, String> nums = new HashMap<>();
    int[] vals = new int[]{1000, 500, 100, 50, 10, 5, 1};

    static {
        nums.put(1, "I");
        nums.put(5, "V");
        nums.put(10, "X");
        nums.put(50, "L");
        nums.put(100, "C");
        nums.put(500, "D");
        nums.put(1000, "M");
    }

    StringBuilder appendThisTimes(String c, int times, StringBuilder sb) {
        for (int i = 0; i < times; i++) {
            sb.append(c);
        }
        return sb;
    }



    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder("");
        int times = 0;
        for (int i = 0; i < vals.length; i++) {
            int curr = vals[i];
            times = num / curr;
            num = num % curr;
            sb = appendThisTimes(nums.get(curr), times, sb);
            int x = -1;
        }

        return sb.toString();
    }
}
