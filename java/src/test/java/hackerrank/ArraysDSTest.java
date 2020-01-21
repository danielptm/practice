package hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysDSTest {

    @Test
    public void testing() {
        int[] items = new int[]{1,4,3,2};

        int[] result = ArraysDS.reverseArray(items);
        int[] expectedInts = new int[]{2,3,4,1};

        List<Integer> resultList = Arrays.stream(result).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.stream(expectedInts).boxed().collect(Collectors.toList());

        Assert.assertEquals(expected, resultList);
    }
}
