package leetcode;

// https://leetcode.com/problems/remove-vowels-from-a-string/
public class RemoveVowels {
    private String[] vowels = new String[]{"a", "e", "i", "o", "u"};

    public String removeVowels(String s) {
        for (int i = 0; i < vowels.length; i++) {
            s = s.replace(vowels[i], "");
        }
        return s;
    }
}
