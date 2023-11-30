package warmup;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WarmupTest {

    @Test
    public void test() {
        String animal = "Doggy";
        Warmup warmup = new Warmup();
        warmup.StringsPractice(animal);
    }

    @Test
    public void sort() {
        int[] items = new int[]{5, 8, 2, 1, 10};
        int[] result = new Warmup().sort(items);
        int[] expected = new int[]{1, 2, 5, 8, 10};
        Assert.assertTrue(Arrays.equals(expected, result));
    }
}
