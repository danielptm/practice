package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseStringTest {
    @Test
    public void test1() {
        char[] input = new char[]{'h','e','l','l','o'};
        char[] expected = new char[]{'o','l','l','e','h'};
        new ReverseString().reverseString(input);

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void test2() {
        char[] input = new char[]{'h','e','l','l','o', 's'};
        char[] expected = new char[]{'s', 'o','l','l','e','h'};
        new ReverseString().reverseString(input);

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void test3() {
        char[] input = new char[]{'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] expected = new char[]{'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};
        new ReverseString().reverseString(input);

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }
}
