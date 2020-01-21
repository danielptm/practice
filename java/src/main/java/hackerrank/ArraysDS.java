package hackerrank;

public class ArraysDS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] newList = new int[a.length];

        for(int i = a.length - 1; i >=0; i--) {
            int newPosition = Math.abs((a.length - 1) - i);
            newList[newPosition] = a[i];
        }
        return newList;
    }
}
