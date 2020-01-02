package hackerrank;

public class AlternatingCharacters {


    /**
     * Complete the alternatingCharacters function in the editor below.
     * It must return an integer representing the minimum number of deletions to make the alternating string.
     * alternatingCharacters has the following parameter(s):
     * s: a string
     * Input Format
     * The first line contains an integer , the number of queries.
     * The next  lines each contain a string .
     * @param s
     * @return
     */
    static int alternatingCharacters(String s) {
        //Loop through array.
        String[] characters = s.split("");
        //Get and store this character and the next character.
        int counter = 0;
        for (int i = 0; i < characters.length - 1; i++) {
            String thisCharacter = characters[i];
            String nextCharacter = characters[i + 1];
            if (thisCharacter.equals(nextCharacter)) {
                counter++;
            }
        }
        //If next character == this character then increment counter
        //Else move to next character and repeat.
        return counter;
    }

}
