package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDictionary {

    private List<String> cache = new ArrayList<>();

    public WordDictionary() {

    }

    public void addWord(String word) {
        cache.add(word);
    }

    public boolean search(String word) {
        if (word.contains(".")) {
            boolean result = false;
            Pattern pattern = Pattern.compile(word);
            for (int i = 0; i < cache.size(); i++) {
                String cachedWord = cache.get(i);
                if (cachedWord.length() != word.length()) {
                    continue;
                }
                Matcher matcher = pattern.matcher(cachedWord);
                if (matcher.find()) {
                    result = true;
                    break;
                }
            }
            return result;
        } else {
            return cache.contains(word);
        }
    }
}
