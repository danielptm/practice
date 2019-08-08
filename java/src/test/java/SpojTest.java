package practice;

import org.junit.Assert;
import org.junit.Test;
import spoj.Spoj;

import java.util.*;


public class SpojTest {

    /**
     * https://www.spoj.com/problems
     *
     * Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything.
     * More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42.
     * All numbers at input are integers of one or two digits.
     *
     * Notes:
     * Why use a linkedHashSet? Because I want the order of insertion to be preserved.
     *
     */
    @Test
    public void getMeaningOfLife(){
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(88);
        numbers.add(42);
        numbers.add(99);
        Set<Integer> items = Spoj.getMeaning(numbers);
        Assert.assertEquals("[1, 2, 88]", items.toString());
    }
}
