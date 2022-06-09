package leetcode.binarysearchplan;

public class BinarySearchPlan {
    public int search(int[] nums, int target) {
        boolean found = false;
        int l = 0;
        int u = nums.length - 1;
        if (u == l) {
            if (nums[u] == target) {
                return u;
            } else {
                return -1;
            }
        }
        if ((u - 1) == l) {
            return chooseWhenNoMiddle(nums, u, l, target);
        }
        int middle = getMiddleIndex(l, u);
        while (!found) {
            if ((u - 1) == l) {
                return chooseWhenNoMiddle(nums, u, l, target);
            }
            if (target == nums[middle]){
                return middle;
            }
            else if (target > nums[middle]) {
                l = middle;
                middle = getMiddleIndex(l, u);
                continue;
            } else if (target < nums[middle]) {
                u = middle;
                middle = getMiddleIndex(l, u);
                continue;
            } else {
                System.out.println("ERROR:");
                return -1;
            }
        }
        return middle;
    }

    static int getMiddleIndex(int l, int u) {
        int mi = (u - l) / 2;
        int m = mi + l;
        return m;
    }

    static int chooseWhenNoMiddle(int[] nums, int u, int l, int t) {
        if (nums[u] == t) {
            return u;
        } else if (nums[l] == t) {
            return l;
        }
        return -1;
    }
}
