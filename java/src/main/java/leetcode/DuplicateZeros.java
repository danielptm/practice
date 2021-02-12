package leetcode;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = arr.length - 1; i>=0; i--) {
            if (arr[i] == 0) {
                try {
                    
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bound.");
                }
            }
        }
    }
}
