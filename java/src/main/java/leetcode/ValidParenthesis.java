package leetcode;

import java.util.*;
import java.util.concurrent.ExecutionException;

//TODO: Commit this to leetcode
// https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {

    //Try using a stack. Push the char onto the stack if its a left bracket
    //Then if it isnt pop it and match them up.
    public boolean isValid(String text) {
        int textLength = text.length();
        if (textLength % 2 != 0) {
            return false;
        }
        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                charStack.push(curr);
            } else {
                try {
                    char fromStack = charStack.pop();
                    if ((curr == ']' && fromStack != '[') ||
                            (curr == '}' && fromStack != '{') ||
                            (curr == ')' && fromStack != '(')) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        if (charStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
