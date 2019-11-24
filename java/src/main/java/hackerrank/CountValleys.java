package hackerrank;

public class CountValleys {

    int n;
    String s;

    public CountValleys(int number, String sequence) {
        this.n = number;
        this.s = sequence;
    }

    public int countValleys() {
        int downHill = 0;
        int uppHill = 0;
        int altitude = 0;
        int numValleys = 0;
        int beg = 0;
        boolean wentDown = false;

        for (int i = 0; i < n; i++) {
            String sequence = s.substring(beg, i);
            //loop through substring
            for (int j = 0; j < sequence.length(); j++) {
                if(sequence.charAt(j) == 'D') {
                    downHill++;
                    altitude++;
                } else {
                    uppHill++;
                    altitude--;
                }
            }
            if (uppHill > 0) {
                if (altitude < 0) {
                    if (downHill == uppHill) {
                        numValleys++;
                        beg = sequence.length();
                    }
                }
            }
            uppHill = 0;
            downHill = 0;
        }
        return numValleys;
    }
}
