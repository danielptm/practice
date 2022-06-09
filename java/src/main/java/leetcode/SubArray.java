package leetcode;

public class SubArray {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int newSum = 0;
            for (int j = i; j < nums.length; j++) {
                int j_val = nums[j];
                newSum += j_val;
                if (newSum > sum) {
                    sum = newSum;
                }
            }

        }
        return sum;
    }
}
