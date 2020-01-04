package interview_questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ACompanyProblem2 {

    public List<Integer> cellCompete(int[] states, int days) {
        List<Integer> adjustedState = new ArrayList<>();
        for (int i = 0; i < days; i ++){
            if (adjustedState.size() == 0) {
                for (int j = 0; j < states.length; j++) {
                    List<Integer> items = Arrays.stream(states).boxed().collect(Collectors.toList());
                    int newState = calculateStateForIndex(j, items);
                    adjustedState.add(newState);
                }
            } else {
                List<Integer> newStates = new ArrayList<>();
                for (int j = 0; j < adjustedState.size(); j++) {
                    int newState = calculateStateForIndex(j, adjustedState);
                    newStates.add(newState);
                }
                adjustedState = newStates;
            }
        }
        // WRITE YOUR CODE HERE
        return adjustedState;
    }

    public int calculateStateForIndex(int index, List<Integer> states) {
        int adjustedState = 0;
        if (index == 0) {
            if (states.get(1) == 0) {
                adjustedState = 0;
            } else {
                adjustedState = 1;
            }
        } else if (index == states.size() - 1) {
            if (states.get(states.size() - 2) == 0) {
                adjustedState = 0;
            } else {
                adjustedState = 1;
            }
        } else {
            if (states.get(index - 1) == states.get(index + 1)) {
                adjustedState = 0;
            } else {
                adjustedState = 1;
            }
        }
        return adjustedState;
    }

    /**
     * Find largest number that all numbers are divisible by.
     * @param num
     * @param arr
     * @return
     */
    public int generalizedGCD(int num, int[] arr) {
        List<Integer> sorted = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        int lowestNumber = sorted.get(0);
        int gcf = 0;

        if (isGcf(lowestNumber, sorted)) {
            gcf = lowestNumber;
        } else {
            gcf = findGcf(lowestNumber, sorted);
        }
        return gcf;
    }

    int findGcf(int upperLimit, List<Integer> numbers) {
        int gcf = 0;
        boolean gcfFound = false;
        for (int i = upperLimit; i > 0 ; i--) {
            if (!gcfFound) {
                for (Integer number : numbers) {
                    if (number % i == 0) {
                        gcf = i;
                        gcfFound = true;
                    } else {
                        gcfFound = false;
                        break;
                    }
                }
            }
        }
        return gcf;
    }

    boolean isGcf(int divisor, List<Integer> numbers) {
        boolean isGcf = false;
        for (Integer number: numbers) {
            if (number % divisor == 0) {
                isGcf = true;
            } else {
                isGcf = false;
                break;
            }
        }
        return isGcf;
    }
}
