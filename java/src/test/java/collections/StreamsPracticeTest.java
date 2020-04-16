package collections;

import org.junit.Assert;
import org.junit.Test;


public class StreamsPracticeTest {

    @Test
    public void testFilter() {
        System.out.println(StreamsPractice.testFilter());
    }

    @Test
    public void testFilter2() {
        System.out.println(StreamsPractice.testFilter2());
    }

    @Test
    public void testMap() {
        System.out.println(StreamsPractice.testMap());
    }

    @Test
    public void testFlatMap() {
        System.out.println(StreamsPractice.testFlatMap());
    }

    @Test
    public void testLimit() {
        System.out.println(StreamsPractice.testLimit());
    }


    @Test
    public void testSorted() {
        System.out.println(StreamsPractice.testSorted());
    }

    @Test
    public void testPeek() {
        System.out.println(StreamsPractice.testPeek());
    }

    @Test
    public void testreduce() {
        System.out.println(StreamsPractice.testReduce());
    }

    @Test
    public void testFlatten() {
        int[][] items = new int[][]{new int[]{1,2,3}, new int[]{4,5,6}};
        int[] result = StreamsPractice.flattenArray(items);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(6, result[5]);
    }
}
