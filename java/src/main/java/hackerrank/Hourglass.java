package hackerrank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hourglass {

    /**
     * Complete the function hourglassSum in the editor below. It should return an integer,
     * the maximum hourglass sum in the array.
     * @param arr
     * @return
     */
    public static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>(16);

        //From top left to right.
        for(int i = 0; i < 4; i++) {
            for (int j = 0; i < 4; i++ ){
                int[] topRow = getTopRowNumbersOfHourGlass(i, j, arr);
                int middleRow = getMiddleRowNumberHourGlass(i, j, arr);
                int[] bottomRow = getBottomRowNumbersHourGlass(i, j, arr);

                sums.add(sumHourGlass(topRow, bottomRow, middleRow));
            }
        }

        //From top right to left.
        for (int i = 0; i < 4; i ++) {
            for (int j = 3; j > 0; j--) {
                int[] topRow = getTopRowNumbersOfHourGlass(i, j, arr);
                int middleRow = getMiddleRowNumberHourGlass(i, j, arr);
                int[] bottomRow = getBottomRowNumbersHourGlass(i, j, arr);

                sums.add(sumHourGlass(topRow, bottomRow, middleRow));
            }
        }

        //From bottom left to right
        for(int i = 3; i > 0; i--) {
            for (int j = 0; j < 4; j++) {
                int[] topRow = getTopRowNumbersOfHourGlass(i, j, arr);
                int middleRow = getMiddleRowNumberHourGlass(i, j, arr);
                int[] bottomRow = getBottomRowNumbersHourGlass(i, j, arr);

                sums.add(sumHourGlass(topRow, bottomRow, middleRow));
            }
        }

        //From bottom right to left
        for (int i = 3; i > 0; i--) {
            for (int j = 3; j > 0; j--) {
                int[] topRow = getTopRowNumbersOfHourGlass(i, j, arr);
                int middleRow = getMiddleRowNumberHourGlass(i, j, arr);
                int[] bottomRow = getBottomRowNumbersHourGlass(i, j, arr);

                sums.add(sumHourGlass(topRow, bottomRow, middleRow));
            }
        }

        return Collections.max(sums);
    }

    private static int sumHourGlass(int[] top, int[] bottom, int middle) {
        int sum = 0;
        for(int i = 0; i < top.length; i++) {
            sum+=top[i];
        }
        for(int i = 0; i < bottom.length; i++) {
            sum+=bottom[i];
        }
        sum+=middle;
        return sum;
    }

    /**
     * @param startRow - the top row in the hour glass to be calculated.
     * @param startIndex - the point used to calculate the hour glass from. It has to be the uppermost left point.
     * @param arr - A row
     * @return And array of numbers for top row.
     */
    private static int[] getTopRowNumbersOfHourGlass(int startRow, int startIndex, int[][] arr) {
        int[] topRow = new int[3];
        topRow[0] = arr[startRow][startIndex];
        topRow[1] = arr[startRow][startIndex + 1];
        topRow[2] = arr[startRow][startIndex + 2];
        return topRow;
    }

    private static int getMiddleRowNumberHourGlass(int startRow, int startIndex, int[][] arr) {
        int middleRow = arr[startRow + 1][startIndex + 1];
        return middleRow;
    }

    private static int[] getBottomRowNumbersHourGlass(int startRow, int startIndex, int[][] arr) {
        int[] bottomRow = new int[3];
        bottomRow[0] = arr[startRow + 2][startIndex];
        bottomRow[1] = arr[startRow + 2][startIndex + 1];
        bottomRow[2] = arr[startRow + 2][startIndex + 2];
        return bottomRow;
    }
}
