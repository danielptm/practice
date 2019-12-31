package hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeAnagramsTest {

    @Test
    public void testing() {
        String a = "cde";
        String b = "abc";

        int result = MakeAnagrams.makeAnagram(a, b);

        Assert.assertEquals(4, result);
    }

//    @Test
//    public void testing4() {
//        String a = "cade";
//        String b = "abcc";
//
//        int result = MakeAnagrams.makeAnagram(a, b);
//
//        Assert.assertEquals(5, result);
//    }

    @Test
    public void testing2() {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int result = MakeAnagrams.makeAnagram(a, b);

        Assert.assertEquals(30, result);
    }

    @Test
    public void testing3() {
        String[] items1 = new String[]{"a", "b", "b"};
        List<String> items2 = new ArrayList<>(
                Arrays.asList(items1)).stream().distinct().collect(Collectors.toList());

        String x = null;
    }
}
