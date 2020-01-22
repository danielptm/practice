package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySelectionSort {
    public static int[] sort(int[] items) {
        List<Integer> itemsAsList = Arrays.stream(items).boxed().collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        int size = itemsAsList.size();
        while (size != 0) {
            int lowest = Integer.MAX_VALUE;
            int lowestIndex = 0;
            for (int j = 0; j < itemsAsList.size(); j++) {
                if (itemsAsList.get(j) < lowest) {
                    lowest = itemsAsList.get(j);
                    lowestIndex = j;
                }
            }
            newList.add(lowest);
            itemsAsList.remove(lowestIndex);
            size = itemsAsList.size();
        }
        return newList.stream().mapToInt(Integer::intValue).toArray();
    }

}
