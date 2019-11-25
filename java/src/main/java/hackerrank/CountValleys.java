package hackerrank;

public class CountValleys {

    /**
     * Gary hikes.
     * He marks each step U (uphill) or D (downhill)
     * He starts and ends at sea level.
     * Each step is 1 unit change in altitude.
     * Mountain - sequence of steps up from sea level and back down to sea level.
     * Valley sequence of consecutive steps below sea level and back up to sea level.
     * Create a function that returns number of valleys gary traverses.
     * @param n
     * @param s
     * @return
     */
    public static int countValleys(int n, String s) {
        int uphillSteps = 0;
        int downHillSteps = 0;
        int altitude = 0;
        boolean inValley = false;
        int completedValley = 0;

        for(int i = 0; i < s.length(); i++) {
            if (downHillSteps > uphillSteps) {
                inValley = true;
            } else {
                inValley = false;
            }
            if (s.charAt(i) == 'D') {
                downHillSteps++;
                altitude--;
            } else {
                uphillSteps++;
                altitude++;
            }

            if (inValley && (altitude == 0)) {
                completedValley++;
            }
        }

        return completedValley;
    }
}
