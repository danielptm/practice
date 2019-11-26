package hackerrank;

import java.util.Hashtable;
import java.util.Map;

public class RansomeNote {
    static void checkMagazine(String[] magazine, String[] note) {
        System.out.println(noteLogic(magazine, note));

    }

    static String noteLogic(String[] magazine, String[] note) {
        Map<String, Word> map = new Hashtable<>(magazine.length);
        boolean canRecreate = false;

        for (String word: magazine) {
            if (map.containsKey(word)) {
                map.get(word).incrementOne();
            } else {
                map.put(word, new Word(word));
            }
        }

        for(String word: note) {
            if (map.containsKey(word)) {
                map.get(word).decrement();
                canRecreate = true;
                if(map.get(word).getCount() == 0) {
                    map.remove(word);
                }
            } else {
                canRecreate = false;
                break;
            }
        }
        return canRecreate ? "Yes" : "No";
    }
}

class Word {
    private String word;
    private int count;

    public Word(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementOne() {
        count++;
    }

    public void decrement() {
        count--;
    }
}