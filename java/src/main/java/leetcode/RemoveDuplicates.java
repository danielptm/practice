package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// This is a stupid problem because the signature does not agree
// with what the unit tests expect.
// From what I can tell this is correct according to one intepretation
// of instructions and signature but wrong by the leetcode unit tests.
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        List<Integer> cache = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!cache.contains(nums[i])) {
                res = res + 1;
                cache.add(nums[i]);
            }
        }
        return res;
    }
}
