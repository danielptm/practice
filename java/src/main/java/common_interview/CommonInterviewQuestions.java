//package common_interview;
//
//import java.util.*;
//
//public class CommonInterviewQuestions {
//
//    /**
//     * Write a Java Program to reverse a string without using String inbuilt function.
//     *
//     * @param original
//     * @return
//     */
//    public static String reverse(String original) {
//        StringJoiner sj = new StringJoiner("", "", "");
//
//        for(int i = original.length() - 1; i >= 0; i--) {
//            sj.add(String.valueOf(original.charAt(i)));
//        }
//
//        return sj.toString();
//    }
//
//    /**
//     * Write a Java Program to count the number of words in a string using HashMap.
//     * @return
//     */
//    public static int countNumberOfWords(String original) {
//        Map<String, String> wordMap = new HashMap<>(original.length() + 1);
//        String keyRoot = "word";
//        List<String> listWords = new ArrayList<>(Arrays.asList(original.split(" ")));
//
//        for(int i = 0; i < listWords.size(); i++) {
//           keyRoot += i + 1;
//           wordMap.putIfAbsent(keyRoot, listWords.get(i));
//        }
//
//        return wordMap.size();
//    }
//}
