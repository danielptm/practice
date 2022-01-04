package random;

import java.util.Arrays;

// A spontaneous sort exercise: Implement a sort algorithm using only int[], no collections. Took ~25 minutes.
public class SimpleSort {

    public int[] sort(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int lowest = Integer.MAX_VALUE;
            int jOfLowest = -1;
            for (int j = 0; j < nums.length; j++) {
                int curr = nums[j];
                if (curr < lowest) {
                    lowest = curr;
                    jOfLowest = j;
                }
            }
            nums[jOfLowest] = Integer.MAX_VALUE;
            result[i] = lowest;
        }
        return result;
    }

    public int[] sortRecursive(int[] nums) {
        int[] result = new int[nums.length];
        recurse(0, nums, result);
        return result;
    }

    public void recurse(int index, int[] nums, int[] result) {
        if (nums.length == 0) {
            return;
        }
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < lowest) {
                lowest = nums[i];
            }
        }

        int finalLowest = lowest;
        result[index] = finalLowest;
        int[] newNums = Arrays.stream(nums).filter(n -> n != finalLowest).toArray();
        recurse(++index, newNums, result);
    }
}
