package algorithms;

public class SelectionSort {

    private int[] items;
    int sortPointer = 0;

    public SelectionSort(int[] items) {
        this.items = items;
    }

    /**
     * Selection sort:
     * Iterate through list and find the item with smallest number and assign it to a variable.
     * Put the number at the sortPointer at the index of the smallest number of that iteration.
     * Put the assigned smallest number at the  place of the pointer.
     * Increment the pointer, and repeat.
     * @return
     */
    public int[] sort() {
        int smallest = Integer.MAX_VALUE;
        for(int i = sortPointer; i < items.length; i++) {
            if (items[i] < smallest) {
                smallest = items[i];
                int replace = items[i];
                items[i] = items[sortPointer];
                items[sortPointer] = replace;
            }
        }
        sortPointer++;
        if (sortPointer != items.length - 1) {
            sort();
        }
        return items;
    }
}
