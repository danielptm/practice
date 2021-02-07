package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/missing-ranges/
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            if (upper == lower) {
                result.add(String.valueOf(upper));
                return result;
            }
            if (upper - lower >= 2) {
                String range = lower + "->" + upper;
                result.add(range);
                return result;
            }
        }

        if (nums.length == 1) {
            String range = null;
            if (lower == upper) {
                return result;
            }
            if (nums[0] == lower) {
                result.add((lower + 1) + "->" + upper);
                return result;
            }
            if (upper - lower == 1) {
                if (upper < 0) {
                    range = String.valueOf(lower);
                } else if (upper == 0) {
                    range = String.valueOf(upper);
                }
                result.add(range);
                return result;
            }
            if ((upper - lower) > 1) {
                result.add(String.valueOf(lower));
                result.add(String.valueOf(upper));
                return result;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (i == 0) {
                if ((curr - lower) == 2) {
                    String range = String.valueOf(lower + 1);
                    result.add(range);
                }
                if (curr - lower > 2) {
                    String range = String.valueOf(lower) + "->" + String.valueOf(curr);
                }
            } else if (i == (nums.length - 1)) {
                if ((upper - curr) == 2) {
                    String range = String.valueOf(curr + 1);
                    result.add(range);
                }
                if (curr - lower > 2) {
                    String range = String.valueOf(curr + 1) + "->" + String.valueOf(upper);
                    result.add(range);
                }
            } else {
                int next = nums[i + 1];
                if (next - curr == 2) {
                    String range = String.valueOf(curr + 1);
                    result.add(range);
                }
                if (next - curr > 2) {
                    String range = String.valueOf(curr + 1) + "->" + String.valueOf(next - 1);
                    result.add(range);
                }
            }

        }
        return result;
    }
}
