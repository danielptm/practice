package hackerrank;

public class BubbleSort {

    /**
     *
     * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
     * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
     * First Element: firstElement, where  is the first element in the sorted array.
     * Last Element: lastElement, where  is the last element in the sorted array.
     * @param a
     */
    static void countSwaps(int[] a) {
        int swapsCounter = 0;
        int firstElement = 0;
        int secondElement = 0;

        int n = a.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
//                    swap(a[j], a[j + 1]);
                    int first = a[j];
                    int second = a[j+1];
                    a[j] = second;
                    a[j+1] = first;
                    swapsCounter++;
                }
            }

        }

        System.out.println("Array is sorted in "+ swapsCounter+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }
}
