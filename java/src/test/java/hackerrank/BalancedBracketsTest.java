package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {

    @Test
    public void testing() {
        String input = "{[()]}";
        String isBalanced = BalancedBrackets.isBalanced(input);
        String expected = "YES";
        Assert.assertEquals(expected, isBalanced);
    }

    @Test
    public void testing2() {
        String input = "{[(])}";
        String isBalanced = BalancedBrackets.isBalanced(input);
        String expected = "NO";
        Assert.assertEquals(expected, isBalanced);
    }

    @Test
    public void testing3() {
        String input = "{{[[(())]]}}";
        String isBalanced = BalancedBrackets.isBalanced(input);
        String expected = "YES";
        Assert.assertEquals(expected, isBalanced);
    }

    @Test
    public void testing4() {
        String input = "}][}}(}][))]";
        String isBalanced = BalancedBrackets.isBalanced(input);
        String expected = "NO";
        Assert.assertEquals(expected, isBalanced);
    }

    @Test
    public void testing5() {
        String input = "[](){()}";
        String isBalanced = BalancedBrackets.isBalanced(input);
        String expected = "YES";
        Assert.assertEquals(expected, isBalanced);
    }
}
