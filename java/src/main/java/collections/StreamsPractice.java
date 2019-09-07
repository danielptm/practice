package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Practice with Stream intermediate operations specifically:
 * filter()
 * limit()
 * sorted()
 * map()
 * flatMap()
 * peek()
 *
 * and with terminal operations:
 * collect
 * count
 * foreach
 * reduce
 * min
 * max
 */
public class StreamsPractice {

    /**
     * Returns a filtered list of all numbers divisble by 2.
     * @return
     */
    public static List<Integer> testFilter() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

    }

    public static long testFilter2() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        return numbers.stream().filter(num -> num % 2 == 0).count();
    }

    /**
     * Returns a new list with each item of the original list multiplied by 2.
     * @return
     */
    public static List<Integer> testMap() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        return numbers.stream().map(num -> num * 2).collect(Collectors.toList());
    }

    /**
     * Add both a capitalized and lowercase version of the animal type to a new list and return it.
     * @return
     */
    public static List<String> testFlatMap() {
        List<String> numbers = new ArrayList<>(Arrays.asList("Cat", "dog"));
        return numbers.stream()
                .flatMap(animal -> Stream.of(animal.toUpperCase(), animal.toLowerCase()))
                .collect(Collectors.toList());
    }


    /**
     * Return the first 3 items in the list.
     * @return
     */
    public static List<Integer> testLimit() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8));
        return numbers.stream().limit(3).collect(Collectors.toList());
    }

    /**
     * Return the list in sorted order.
     * @return
     */
    public static List<Integer> testSorted() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8));
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    /**
     * Debug each item by printing it out using the peek method
     * @return
     */
    public static List<String> testPeek() {
        List<String> numbers = new ArrayList<>(Arrays.asList("cat", "dog"));
        return numbers.stream().peek(item -> System.out.println(item)).collect(Collectors.toList());
    }

    /**
     * Combine sum all numbers in the array with reduce.
     * @return
     */
    public static Integer testReduce() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8));
        return numbers.stream().sorted().reduce(0, (subtotal, elem) -> subtotal += elem);
    }

}
