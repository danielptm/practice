package practice;

public class StringPractice {

    public static String getCharacterAtIndex(String text,  int index){
        return Character.toString(text.charAt(index));
    }

    public static int getUnicodePointFromIndex(String text, int index){
        return text.codePointAt(index);
    }

    public static String spliceStringFromIndex(String text, int beg, int end){
        return text.substring(beg, end);
    }

    public static String putStringInsideOtherString(String container, String text){
        return container.substring(0,2).concat(text).concat(container.substring(2, 4));
    }
}
