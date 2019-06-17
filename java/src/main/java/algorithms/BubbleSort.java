package algorithms;

public class BubbleSort {

    private int sortPointer;
    private int items[];

    public BubbleSort(int[] unsorted) {
        sortPointer = unsorted.length - 1;
        this.items = unsorted;
    }


    public int[] sort() {
        for(int i = 0; i < this.sortPointer; i++) {
            if (items[i] > items[i + 1]) {
                int newLeft = items[i + 1];
                int newRight = items[i];
                items[i] = newLeft;
                items[i + 1] = newRight;
                sort();
            }
        }
        return items;
    }
}
