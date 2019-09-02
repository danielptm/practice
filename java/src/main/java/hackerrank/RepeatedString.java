package hackerrank;

/**
 * What I learned: Make the variable names as good as possible with description above each one.
 */
public class RepeatedString {

    /**
     * Get number of occurances of a in a given string given the fact that it is repeated to n length.
     * @param s
     * @param n
     * @return
     */
    public static long repeatedString(String s, long n) {
        //Get number of occurances of the letter of the string.
        //Get the length of s
        //Get the modulo of n by the length of s
        //Get the substring of the remainder.
        long lengthOfS = s.length();
        long remainder = 0;
        long multiplyNumber = 0;
        long result = 0;
        long occurancesInRemainder = 0;
        String substringOfRemainder;

        long occurancesOfFullString = countOccurancesOfa(s);

        remainder = n % lengthOfS;
        multiplyNumber = n / lengthOfS;
        substringOfRemainder = s.substring(0, (int) remainder);
        occurancesInRemainder = countOccurancesOfa(substringOfRemainder);

        result = (multiplyNumber * occurancesOfFullString) + occurancesInRemainder;
        return result;
    }

    static long countOccurancesOfa(String s) {
        long occurances = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') {
                occurances++;
            }
        }
        return occurances;
    }


}
