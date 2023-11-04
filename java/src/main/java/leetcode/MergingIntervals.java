package leetcode;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergingIntervals {
    public int[][] merge(int[][] intervals) {
        int prevMin = Integer.MIN_VALUE;
        int prevMax = Integer.MAX_VALUE;

        for (int i = 1; i < intervals.length; i++) {
            int[] prevInterval = intervals[i - 1];
            prevMin = prevInterval[0];
            prevMax = prevInterval[1];

        }
        return null;
    }
}
