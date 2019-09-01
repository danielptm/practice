package algorithms;


import java.util.List;

public class InsertionSort {

    public static List<Integer> sort(List<Integer> numbers) {
        Integer tempPlace;
        for(int i = 0; i < numbers.size(); i++) {
            tempPlace = numbers.get(i);
            numbers.set(i, null);
            if ( i != numbers.size() - 1) {
                if (numbers.get(i + 1) < tempPlace) {
                    numbers.set(i, numbers.get(i + 1));
                }
            } else {
                numbers.set(i, tempPlace);
            }
        }
        return numbers;
    }
}
