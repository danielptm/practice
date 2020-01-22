package algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySelectionSortTest {

    @Test
    public void testing() {
        int[] items = new int[]{3, 2, 5, 4};
        int[] expected = new int[]{2, 3, 4, 5};
        List<Integer> expectedAsList = Arrays.stream(expected).boxed().collect(Collectors.toList());
        int[] result = MySelectionSort.sort(items);
        List<Integer> itemsAsList = Arrays.stream(result).boxed().collect(Collectors.toList());
        Assert.assertEquals(expectedAsList, itemsAsList);
    }

    @Test
    public void testing2() {
        int[] nums = new int[]{1, 2, 3};
        int num = 4;
        int[] result = MySelectionSort.addItemToArray(num, nums);
        Assert.assertEquals(4, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(4, result[3]);
    }

    @Test
    public void testing3() {
        int[] nums = new int[]{1, 2, 3};
        int index = 1;

        int[] result = MySelectionSort.removeItemFromArray(index, nums);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(3, result[1]);
    }
}
