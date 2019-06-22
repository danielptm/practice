package practice.algorithms;

import algorithms.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSelectionSort {
    @Test
    public void testSort() {
        String expected = "[1, 2, 3, 4, 5]";
        int[] unsorted = new int[]{3, 1, 2, 5, 4};
        SelectionSort selectionSort = new SelectionSort(unsorted);

        int[] sorted = selectionSort.sort();

        Assert.assertEquals(expected, Arrays.toString(sorted));
    }
}
