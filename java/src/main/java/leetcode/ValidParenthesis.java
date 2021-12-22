package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO: Commit this to leetcode
// https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {

    //Try using a stack. Push the char onto the stack if its a left bracket
    //Then if it isnt pop it and match them up.
    public boolean isValid(String text) {
        Map<String, String> opposites =  getOpposities();
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            String current = String.valueOf(text.charAt(i));
            if (opposites.get(current) != null) {
                int oppositeIndex = text.indexOf(opposites.get(current), i);
                if (oppositeIndex == -1) {
                    result.add(false);
                    continue;
                }
                if (((oppositeIndex + 1) % 2) == 0) {
                    result.add(true);
                    continue;
                }
            } else {
                continue;
            }
        }
        return result.contains(false) ? false : true;
    }

    public Map<String, String> getOpposities() {
        Map<String, String> OPPOSITIES = new HashMap<>();
        OPPOSITIES.put("(", ")");
//        OPPOSITIES.put(")", "(");
        OPPOSITIES.put("{", "}");
//        OPPOSITIES.put("}", "{");
        OPPOSITIES.put("[", "]");
//        OPPOSITIES.put("]", "[");
        return OPPOSITIES;

    }
}
