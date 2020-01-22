package utils;

import java.util.Arrays;

public class Utils {

    /**
     * Adds the item to the end of the array
     * @param num
     * @param nums
     * @return
     */
    public static int[] addItemToArray(int num, int[] nums) {
        int[] newArray = Arrays.copyOf(nums, nums.length + 1);
        newArray[newArray.length - 1] = num;
        return newArray;
    }

    /**
     * Removes an item from index position in the array.
     *
     * More clear description of System.arrayCopy() params :
     * source_arr : array to be copied from
     * sourcePos : starting position in source array from where to copy
     * dest_arr : array to be copied in
     * destPos : starting position in destination array, where to copy in
     * len : total no. of components to be copied.
     */
    public static int[] removeItemFromArray(int index, int[] nums) {
        int[] newArray = new int[nums.length - 1];
        int[] from = Arrays.copyOfRange(nums, 0, index);
        int[] to = Arrays.copyOfRange(nums, index + 1, nums.length);
        System.arraycopy(from, 0, newArray, 0, from.length);
        System.arraycopy(to, 0, newArray, from.length, to.length);
        return newArray;
    }

    public static boolean contains(int num, int[] numsArray) {
        boolean exists = false;
        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] == num) {
                exists = true;
            }
        }
        return exists;
    }

}
