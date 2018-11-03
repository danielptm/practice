package practice;

import org.omg.PortableInterceptor.INACTIVE;

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

    /**
     * Takes a code as a string and removes all of the preceding 0's before
     * numbers > 0.
     */
    public static String stripZeros(String code){
        return Integer.valueOf(code).toString();
    }

    public static String calculateEPId(String id){
        if(! id.equals("NULL") && ! id.substring(0,4).equals("9000")){
            return id;
        } else {
            return "NULL";
        }
    }

    public static String calculatePId(String id){
        if(id.substring(0,4).equals("9000")){
            return id;
        } else {
            return "NULL";
        }
    }


}
