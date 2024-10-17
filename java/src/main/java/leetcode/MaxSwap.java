package leetcode;

public class MaxSwap {
    public int go(int num) {
        int highest = -1;
        int secondHighest = -1;
        String sNum = Integer.toString(num);
        for (int i = 0; i < sNum.length(); i++) {
            int n = Integer.valueOf(sNum.substring(i, i + 1));
            if (n > highest ) {
                highest = i;
            }
        }
        for (int j = 0; j < sNum.length(); j++) {
            int n = Integer.valueOf(sNum.substring(j, j + 1));
            if (n < highest && n > secondHighest) {
                secondHighest = j;
            }
        }

        return 1;
    }

}
