package leetcode;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        List<Integer> l = Arrays.stream(nums).boxed().collect(Collectors.toList());
        l.add(target);
        Collections.sort(l);
        int res = l.indexOf(target);
        return res;
    }
}
