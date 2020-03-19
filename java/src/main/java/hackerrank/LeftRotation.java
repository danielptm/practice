package hackerrank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotation {



    public static void leftShift(int[] a, int d) {
        int[] shifted = new int[a.length];
        if (d == 0) {
            print(a);
        } else {
            shifted[a.length - 1] = a[0];
            int temp = 0;
            for ( int i = 1; i < a.length; i++) {
                temp = a[i];
                shifted[i - 1] = temp;
                String x = null;
            }
            int newD = d - 1;
            leftShift(shifted, newD);
        }
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
