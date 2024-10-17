package leetcode;

import java.util.*;


//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        List<Integer> ns = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!ns.contains(n)) {
                ns.add(n);
            }
        }
        for (int i = 0; i < ns.size(); i++) {
            nums[i] = ns.get(i);
        }

        return ns.size();
    }
}
