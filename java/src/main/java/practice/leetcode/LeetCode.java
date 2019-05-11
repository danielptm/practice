package practice.leetcode;

public class LeetCode {


    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] intsToReturn = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    intsToReturn[0] = j;
                    intsToReturn[1] = i;
                }
            }
        }
        if (intsToReturn[0] == -1 && intsToReturn[1] == -1) {
            throw new IllegalArgumentException("It is not possible to sum elements in the array to equal the target.");
        }
        return intsToReturn;
    }
}
