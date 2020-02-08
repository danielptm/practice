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
    public void testin2g() {
        System.out.println(5 / 2);
    }
}
