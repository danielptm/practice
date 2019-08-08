package algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestBubbleSort {

    @Test
    public void testBubbleSort() {
        String expected = "[1, 2, 3, 4, 5]";
        int[] unsorted = new int[]{3, 1, 2, 5, 4};
        BubbleSort bubbleSort = new BubbleSort(unsorted);

        int[] sorted = bubbleSort.sort();

        Assert.assertEquals(expected, Arrays.toString(sorted));
    }
}
