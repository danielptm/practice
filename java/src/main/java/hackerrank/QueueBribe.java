package hackerrank;

public class QueueBribe {

    public static void minimumBribes(int[] q) {
        int bribes = 0;
        boolean tooChaotic = false;
        for(int i = 0; i < q.length; i++) {
            int diff = getPositionDifferenceFromStartPoint(i, q[i]);
            bribes += diff;
            System.out.println("value: " + q[i] + " index:" + i + " diff: " + diff + " bribes: " + bribes);
            if (bribedTooMuch(i, q[i])) {
                tooChaotic = true;
                System.out.println("Too chaotic");
                break;
            }
        }

        if(! tooChaotic) {
            System.out.println(bribes / 2);
        }
    }

    private static int getPositionDifferenceFromStartPoint(int index, int value) {
        return Math.abs((value - 1) - index);
    }

    private static boolean bribedTooMuch(int index, int value) {
        boolean valid = false;
        int placesAdvanced = (value - 1) - index;
        if (placesAdvanced > 2) {
            valid = true;
        }
        return valid;
    }


}
