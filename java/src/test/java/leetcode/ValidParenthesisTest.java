package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class ValidParenthesisTest {
    @Test
    public void validParenthesis1() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "()";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(true, result);
    }

    @Test
    public void validParenthesis2() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "()[]{}";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(true, result);
    }

    @Test
    public void validParenthesis3() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "()[]{}{";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis4() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "()[{}{}";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis5() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "[({})]{}{}";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(true, result);
    }

    @Test
    public void validParenthesis6() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "([)]";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis7() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "((";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis8() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "){";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis9() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "([";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(false, result);
    }

    @Test
    public void validParenthesis10() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String text = "(([]){})";
        boolean result = validParenthesis.isValid(text);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testing1() {
        Stack<String> items = new Stack<>();
        items.push("a");
        items.push("b");
        items.push("c");
        String x = null;

        items.pop();
        String a = null;
        items.pop();
        String b = null;
        items.pop();
        String c = null;
    }
}



