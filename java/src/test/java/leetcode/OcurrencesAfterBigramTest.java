package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class OcurrencesAfterBigramTest {

    @Test
    public void test1() {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        String[] result = new OccurencesAfterBigram().findOcurrences(text, first, second);
        String[] expected = new String[]{"girl","student"};

        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }

    @Test
    public void test2() {
        String text = "we will we will rock you", first = "we", second = "will";
        String[] expected = new String[]{"we","rock"};
        String[] result = new OccurencesAfterBigram().findOcurrences(text, first, second);

        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }

    @Test
    public void test3() {
        String text = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa", first = "kcyxdfnoa", second = "jkypmsxd";
        String[] expected = new String[]{"kcyxdfnoa","kcyxdfnoa","kcyxdfnoa"};
        String[] result = new OccurencesAfterBigram().findOcurrences(text, first, second);

        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }
}
