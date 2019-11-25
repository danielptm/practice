package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] items = a;
        for(int i = 0; i < d; i++) {
            items = oneLeft(items);
        }
        return items;

    }

    static int[] oneLeft(int[] items) {
        int[] items2 = new int[items.length];
        int length = items.length - 1;
        for(int i = 0; i <= length; i++) {
            int item = items[i];
            if (i == 0) {
                items2[length] = item;
            } else {
                items2[i - 1] = item;
            }
        }
        return items2;
    }

    private static void print(List<Integer> a) {
        System.out.println(a);
    }

}
