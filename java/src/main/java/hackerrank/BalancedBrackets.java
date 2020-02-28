package hackerrank;

import java.util.EmptyStackException;
import java.util.Stack;


/**
 * Not done...
 *
 * https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 *
 */
public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        String returnWord = "NO";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '{':
                    stack.push('{');
                    break;
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
            }
            if ((c != '{') && (c != '(') && (c != '[')) {
                try {
                    char peeked = stack.peek();
                    switch (c) {
                        case '}':
                            if (peeked == '{') {
                                returnWord = "YES";
                                stack.pop();
                            } else {
                                returnWord = "NO";
                            }
                            break;
                        case ')':
                            if (peeked == '(') {
                                returnWord = "YES";
                                stack.pop();
                            } else {
                                returnWord = "NO";
                            }
                            break;
                        case ']':
                            if (peeked == '[') {
                                returnWord = "YES";
                                stack.pop();
                            } else {
                                returnWord = "NO";
                            }
                            break;
                    }
                } catch (EmptyStackException e) {
                    System.out.println("Empty stack exception occurred for char at index: " + i);
                    returnWord = "NO";
                    break;
                }
            }
        }
        return returnWord;
    }
}
