package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void test() {
        String word = "hannah";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(word);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test2() {
        String word = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(word);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test3() {
        String word = "0P";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(word);
        Assert.assertEquals(false, result);
    }

    @Test
    public void blah() {
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        char ZERO = '0';
        char NINE = '9';

        String x = null;
    }
}
