package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public void go(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for (int i = 0; i < m; i++) {
            result[i] = nums1[i];
        }
        for (int i = n; i < (m + n); i++) {
            result[i] = nums2[i - n];
        }
        result = Arrays.stream(result).sorted().toArray();
        for (int i = 0; i < (n+m); i++) {
            nums1[i] = result[i];
        }
    }
}
