package daily_problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class August62020 {

    /**
     * You are given an array of arrays of integers, where each array corresponds to a row in a triangle of numbers. For example, [[1], [2, 3], [1, 5, 1]] represents the triangle:
     *   1
     *  2 3
     * 1 5 1
     * We define a path in the triangle to start at the top and go down one row at a time to an adjacent value, eventually ending with an entry on the bottom row. For example, 1 -> 3 -> 5.
     * The weight of the path is the sum of the entries.
     * Write a program that returns the weight of the maximum weight path.
     */
    @Test
    public void testing() {
        int[][] nums = {{1}, {2, 3}, {1, 5, 1}};
        int result = max(nums);
        Assert.assertEquals(9, result);

    }


    //TODO: Alternative interpretation of problem. To dermine path relative to row, must go down 1 row to [same index location] or [same index location + 1]
    @Test
    public void testing2() {
        int[][] nums = {{1}, {2, 3}, {1, 5, 1}};
        int result = max(nums);
        Assert.assertEquals(9, result);

    }

    int max(int[][] nums) {
        int weight = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = Arrays.stream(nums[i]).sorted().toArray()[nums[i].length - 1];
            weight += max;
        }
        return weight;
    }

    int max2(int[][] nums) {
        return 0;
    }
}
