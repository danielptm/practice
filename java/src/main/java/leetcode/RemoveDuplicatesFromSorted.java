package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        int rem = size - list.size();

        for (int i = 0; i < rem; i++) {
            list.add(Integer.MIN_VALUE);
        }

        return list.size();
    }
}
