package daily_problem;

import org.junit.Assert;
import org.junit.Test;

public class June262020 {

    /**
     * Given a string, return the first recurring character in it, or null if there is no recurring character.
     * For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
     */
    @Test
    public void test() {
        String input = "acbbac";
        String result = get(input);
        Assert.assertEquals("b", result);
    }

    @Test
    public void test2() {
        String input = "abcdef";
        String result = get(input);
        Assert.assertNull(result);
    }

    @Test
    public void tes3t() {
        String input = "acbacc";
        String result = get(input);
        Assert.assertEquals("c", result);
    }

    public String get(String text) {
        if (text.length() == 1) {
            return null;
        }
        String compr = String.valueOf(text.charAt(0));
        String substr = text.substring(1);

        if (compr.equals(String.valueOf(substr.charAt(0)))) {
            return compr;
        }
        String x = get(substr);
        return x;
    }
}
