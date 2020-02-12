package hackerrank;

import java.util.HashMap;
import java.util.Map;


/**
 * Not done...
 *
 * https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 *
 */
public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        String result = "NO";
        int length = s.length();

        Map<String, Map<String, String>> items = new HashMap<>();


        Map<String, String> curvy = new HashMap<>();
        curvy.put("left", "{");
        curvy.put("right", "}");
        items.put("{", curvy);

        Map<String, String> bracket = new HashMap<>();
        bracket.put("left", "[");
        bracket.put("right", "]");
        items.put("[", bracket);

        Map<String, String> parenthesis = new HashMap<>();
        parenthesis.put("left", "(");
        parenthesis.put("right", ")");
        items.put("(", parenthesis);


        Map<String, String> curvy2 = new HashMap<>();
        curvy2.put("left", "{");
        curvy2.put("right", "}");
        items.put("}", curvy2);

        Map<String, String> bracket2 = new HashMap<>();
        bracket2.put("left", "[");
        bracket2.put("right", "]");
        items.put("]", bracket2);

        Map<String, String> parenthesis2 = new HashMap<>();
        parenthesis2.put("left", "(");
        parenthesis2.put("right", ")");
        items.put(")", parenthesis2);

        if ( (length % 2) != 0) {
            return result;
        } else {
            for (int i = 0; i < s.length() / 2; i++) {
                int opp = (length - 1) - i;
                String c = String.valueOf(s.charAt(i));
                String opposite = String.valueOf(s.charAt(opp));

                if ((items.get(c).get("right").equals(opposite)) || (items.get(c).get("left").equals(opposite))) {
                    result = "YES";
                } else {
                    result = "NO";
                    return result;
                }
            }
        }
        return result;
    }

}
