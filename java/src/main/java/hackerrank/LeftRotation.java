package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int[] items = a;
        for(int i = 0; i < d; i++) {
            items = oneLeft(items);
        }
        print(items);
        return items;
    }

    static void print(int[] items) {
        String toPrint = "";
        for (int i = 0; i < items.length; i++) {
            if (i != (items.length - 1)) {
                toPrint += items[i] + " ";
            } else {
                toPrint+=items[i];
            }
        }
        System.out.println(toPrint);
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
