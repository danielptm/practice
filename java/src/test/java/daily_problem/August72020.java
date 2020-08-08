package daily_problem;

import org.junit.Test;

public class August72020 {

    /**
     * Write a program that checks whether an integer is a palindrome.
     * For example, 121 is a palindrome, as well as 888. 678 is not a palindrome.
     * Do not convert the integer into a string.
     */
    @Test
    public void testing() {
        int num1 = 121; //true
        int num2 = 888; //true
        int num3 = 678; //false
        boolean result1 = check(num1);
//        boolean result2 = check(num2);
//        boolean result3 = check(num3);
//
//        Assert.assertTrue(result1);
//        Assert.assertTrue(result2);
//        Assert.assertFalse(result3);
    }

    //I didnt write this ... just put this into debugger to see how it works.
    boolean check(int num) {
        int tmp = num;
        int reversed_num = 0;

        while (tmp != 0) {
            reversed_num = (reversed_num * 10) + (tmp % 10);
            tmp /= 10;
            int x = 0;
        }
        return num == reversed_num;
    }
}
