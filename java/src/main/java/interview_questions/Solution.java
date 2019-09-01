package interview_questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private Solution() {}

    public static int getMedian(int[] array1, int[] array2) {
        List<Integer> combinedItems = new ArrayList(Arrays.asList(array1, array2));
        //Accomplish the exact same thing below with Collections.sort();
        List<Integer> items = sort(combinedItems);
        return getMedian(items);
    }

    public static List<Integer> sort(List<Integer> combinedItems) {
        int sortPointer = combinedItems.size() - 1;

        for(int i = 0; i < sortPointer; i++) {
            if (combinedItems.get(i).compareTo(combinedItems.get(i + 1)) > 1) {
                Integer newLeft = combinedItems.get(i + 1);
                Integer newRight = combinedItems.get(i);
                combinedItems.set(i, newLeft);
                combinedItems.set(i + 1, newRight);
                sort(combinedItems);
            }
        }
        return combinedItems;
    }

    public static int getMedian(List<Integer> items) {
        if (items.size() % 2 == 0) {
            return (items.get((items.size() / 2) - 1) + items.get(items.size() / 2)) / 2 ;
        } else {
            return (items.size() / 2) + 1;
        }
    }

}
