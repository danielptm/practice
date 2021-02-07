package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/occurrences-after-bigram/
public class OccurencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> textArray = Arrays.asList(text.split(" "));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < textArray.size(); i++) {
            try {
                if (textArray.get(i).equals(first) && textArray.get(i + 1).equals(second)) {
                    result.add(textArray.get(i + 2));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
