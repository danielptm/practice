package spoj;

import java.util.Set;
import java.util.TreeSet;

/**
 * These are solutions to problems from the website.
 *
 * https://www.spoj.com/problems
 *
 */
public class Spoj {

    /**
     * Notes: Why use a TreeSet? It probably would have been well and good to use a LinkedHashSet,
     * because that is what is being sent in from the test. But I chose the TreeSet because
     * I wanted the numbers to be ordered in their natural order.
     * @param numbers
     * @return
     */
    public static Set<Integer> getMeaning(Set<Integer> numbers){
        Set<Integer> returnItems = new TreeSet<>();

        for(Integer number: numbers){
            if(number != 42){
                returnItems.add(number);
            }
            else {
                break;
            }
        }
        return returnItems;
    }
}
