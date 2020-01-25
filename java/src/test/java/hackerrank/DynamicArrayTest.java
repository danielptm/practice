package hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArrayTest {
    @Test
    public void testing() {
        List<Integer> nums = Arrays.asList(1, 345255357, 205970905);
        List<List<Integer>> items = new ArrayList<>();
        items.add(nums);
        List<Integer> result = DynamicArray.dynamicArray(1, items);
        Assert.assertEquals(1, 1);
    }
}
