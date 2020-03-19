package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotation {



    public static int[] leftShift(int[] a, int d) {
        int[] shifted = new int[a.length];
        if (d == 0) {
            print(a);
            return a;
        } else {
            shifted[0] = a[a.length - 1];
            int temp = 0;
            for ( int i = 0; i < a.length - 1; i++) {
                temp = a[i];
                shifted[i+1] = temp;
                String x = null;
            }
            int newD = d - 1;
            return leftShift(shifted, newD);
        }
    }

    private static void print(int[] a) {
        List<Integer> items = IntStream.of(a).boxed().collect(Collectors.toList());
        System.out.println(items);
    }

}
