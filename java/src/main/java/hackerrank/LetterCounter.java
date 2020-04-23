package hackerrank;

public class LetterCounter {

    static String get(String word) {
        String result = "";
        result += traverse(word, "", 0, 1);
        return result;
    }

    static String traverse(String word, String seg, int i, int count) {
        char curr = '?';
        char next = '?';

        if (i < word.length()) {
            curr = word.charAt(i);
        }
        if (i >= word.length()) {
            return seg;
        }
        if (i < (word.length())) {
            next = i <= word.length() - 2 ? word.charAt(i + 1) : '?';
            if (curr == next) {
                return traverse(word, seg, ++i, ++count);
            } else {
                seg += String.valueOf(curr) + count;
                i = count == 1 ? i + count : i + count - 1;
                count = 1;
            }
        }
        return traverse(word, seg, i, count);
    }
}
