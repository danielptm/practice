package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] splitWords = s.split(" ");
        List<String> cleaned = new ArrayList<>();
        for(String w: splitWords) {
            cleaned.add(w.trim());
        }
        return cleaned.get(cleaned.size() - 1).length();
    }
}
