package hackerrank;

public class Clouds {

    /**
     * What i learned: If you are at a position in an array and you need to gauge what is happening at other
     * places in the array from the position you are in. Do not just select that position in the array.
     * Create a variable for that other position and name it well. It will make writing/debugging the algorithm
     * easier.
     * @param c
     * @return
     */
    public static int jumpingOnClouds(int[] c) {
        int jumpCounter = 0;
        for (int i = 0; i < c.length - 1;) {
            System.out.println("On cloud: " + i);
            int twoPlacesFromEnd = c.length - 3;
            if (i <= twoPlacesFromEnd) {
                int gaugedValue = c[i + 2];
                if (gaugedValue != 1) {
                    i+=2;
                    jumpCounter++;

                } else {
                    i++;
                    jumpCounter++;
                }
            } else {
                i++;
                jumpCounter++;
            }
        }
        return jumpCounter;
    }
}
