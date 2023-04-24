package leetcode;

import java.util.*;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int l = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < l; i++) {
            if (numsMap.containsKey(nums[i])) {
                return nums[i];
            } else {
                numsMap.put(nums[i], nums[i]);
            }
        }
        return -1;
    }

    public int findDuplicate2(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return nums[i];
            } else {
                numsSet.add(nums[i]);
            }
        }
        return -1;
    }

    public int findDuplicate3(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return nums[i];
            } else {
                numsSet.add(nums[i]);
            }
        }
        return -1;
    }
}
