package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MapSumTest {

    @Test
    public void testEasyInsert() {
        MapSum mapSum = new MapSum();
        mapSum.easyInsert("col", 3);
        Assert.assertEquals(Integer.valueOf(3), mapSum.getEasyMap().get("col"));
    }

    @Test
    public void testEasySum() {
        MapSum mapSum = new MapSum();
        mapSum.easyInsert("column", 3);
        mapSum.easyInsert("columnar", 2);
        mapSum.easyInsert("coumnar", 2);
        int result = mapSum.easySum("col");
        Assert.assertEquals((int) Integer.valueOf(5), result);
    }

    @Test
    public void stressTestEasySum() {
        MapSum mapSum = new MapSum();
        mapSum.easyInsert("column", 3);
        mapSum.easyInsert("columnar", 2);
        for (int i = 0; i < 19500000; i++) {
            mapSum.easyInsert("x:" + String.valueOf(i), 2);
        }
        long start = System.nanoTime();
        System.out.println("Start: " + String.valueOf(start));
        int result = mapSum.easySum("col");
        Assert.assertEquals((int) Integer.valueOf(5), result);
        long end = System.nanoTime();
        System.out.println("End: " + String.valueOf(end - start));
    }

    @Test
    public void testInsert() {
        MapSum mapSum = new MapSum();
        mapSum.insert("column", 3);
        mapSum.insert("coldude", 3);
        Assert.assertEquals(Integer.valueOf(3), mapSum.getEasyMap().get("col"));
    }

    @Test
    public void testSum() {
        MapSum mapSum = new MapSum();
        mapSum.insert("column", 3);
        mapSum.insert("columnar", 2);
        mapSum.insert("coumnar", 2);
        int result = mapSum.sum("col");
        Assert.assertEquals((int) Integer.valueOf(5), result);
    }

}
