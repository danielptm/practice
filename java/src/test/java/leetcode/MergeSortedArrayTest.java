package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void testGo(){
        int[] expected = new int[]{1,2,2,3,5,6};
        int[] input = new int[]{1,2,3,0,0,0};
        int[] secondInput = new int[]{2,5,6};
        new MergeSortedArray().go(input, 3, secondInput, 3);
        Assert.assertEquals(expected[0], input);
    }

    @Test
    public void testGo2(){
        int[] expected = new int[]{1};
        int[] input = new int[]{1};
        int[] secondInput = new int[]{};
        new MergeSortedArray().go(input, 1, secondInput, 0);
        Assert.assertEquals(expected[0], input);
    }

    @Test
    public void testGo3(){
        int[] expected = new int[]{1};
        int[] input = new int[]{1};
        int[] secondInput = new int[]{};
        new MergeSortedArray().go(input, 1, secondInput, 0);
        Assert.assertEquals(expected[0], input);
    }

    @Test
    public void testGo4(){
        int[] expected = new int[]{1};
        int[] input = new int[]{0};
        int[] secondInput = new int[]{};
        new MergeSortedArray().go(input, 1, secondInput, 0);
        Assert.assertEquals(expected[0], input);
    }
}
