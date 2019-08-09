package common_interview;

import java.util.*;

public class CommonInterviewQuestions {

    /**
     * Write a Java Program to reverse a string without using String inbuilt function.
     *
     * @param original
     * @return
     */
    public static String reverse(String original) {
        StringJoiner sj = new StringJoiner("", "", "");

        for(int i = original.length() - 1; i >= 0; i--) {
            sj.add(String.valueOf(original.charAt(i)));
        }

        return sj.toString();
    }

    /**
     * Write a Java Program to count the number of words in a string using HashMap.
     * @return
     */
    public static int countNumberOfWords(String original) {
        Map<String, String> wordMap = new HashMap<>(original.length() + 1);
        String keyRoot = "word";
        List<String> listWords = new ArrayList<>(Arrays.asList(original.split(" ")));

        for(int i = 0; i < listWords.size(); i++) {
           keyRoot += i + 1;
           wordMap.putIfAbsent(keyRoot, listWords.get(i));
        }

        return wordMap.size();
    }

    /**
     *  Write a Java Program to iterate HashMap using While.
     */
    public static void iterateHashMap() {
        Map<String, String> items = new HashMap<>();

        items.putIfAbsent("item1", "dog");
        items.putIfAbsent("item2", "cat");
        Iterator iterator = items.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> item = (Map.Entry) iterator.next();
            System.out.println(item.getValue());
        }
    }

    /**
     * Write a Java Program to find whether a number is prime or not.
     */

    public static boolean findPrimeNumber(int number) {
        boolean notDivisible = true;
        for (int i = 2; i < number; i ++) {
            if (number % i == 0) {
                notDivisible = false;
                break;
            }
        }
        return notDivisible;
    }

    /**
     * Write a Java Program to find whether a string or number is palindrome or not.
     *
     * Reads the same backwards as forwards
     */
    public static boolean isPalindrome(String word) {
        String wordReversed = reverse(word);
        return word.equals(wordReversed);
    }
}
