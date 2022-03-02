package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        Stack<String> stack = new Stack<>();
        String cleaned = removeCrap(s);
        for (int i = 0; i < cleaned.length(); i++) {
            String c = String.valueOf(cleaned.charAt(i));
            stack.add(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            String c = stack.pop();
            reversed += c;
        }
        if (reversed.equals(cleaned)){
            return true;
        }
        return false;
    }

    String removeCrap(String s) {
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)) {
                cleaned += String.valueOf((char) c).toLowerCase();
            }

        }
        return cleaned;
    }
}
