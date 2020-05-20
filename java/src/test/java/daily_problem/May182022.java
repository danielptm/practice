package daily_problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class May182022 {

    /**
     * Given a string which we can delete at most k, return whether you can make a palindrome.
     *
     * For example, given 'waterrfetawx' and a k of 2, you could delete f and x to get 'waterretaw'.
     *
     */
    @Test
    public void testing() {
        int k = 2;
        boolean result =  isPossible(k, "waterrfetawx");
        Assert.assertTrue(result);
    }

    @Test
    public void testReverse() {
        String word = "cat";
        String rev = reverse(word);
        Assert.assertEquals("tac", rev);
    }

    boolean isPossible(int k, String text) {
        if (text.equals(reverse(text))) {
            return true;
        }
        if (k == 0) {
            return false;
        }

        String subText = text;
        char left = '?';
        char right = '?';

        while (left == right) {
            left = subText.charAt(0);
            right = subText.charAt(subText.length() - 1);
            if (left == right) {
                subText = subText.substring(1, subText.length() - 1);
            }
        }
        String withRemoved = subText.charAt(0) == subText.charAt(subText.length() - 2) ? subText.substring(0, subText.length() - 1) : subText.substring(1);
        int a = k - 1;
        return isPossible(a, withRemoved);
    }

    String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i>=0; i--) {
            rev += String.valueOf(text.charAt(i));
        }
        return rev;
    }
}
