package algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAlgorithms {

    @Test
    public void testInsertionSort() {
        List<Integer> unsorted = new ArrayList<>(Arrays.asList(1, 5, 3));
        Assert.assertEquals("[1, 3, 5]", InsertionSort.sort(unsorted).toString());
    }
}
