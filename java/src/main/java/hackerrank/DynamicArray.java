package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    /**
     * Not complete because I flat out dont understand what im supposed to do here.
     *
     * query1:
     * index = ((x ^ lastAnswer))
     * append y to sequence at index.
     *
     * query2:
     * index = ((x ^ lastAnswer))
     * value = y % size of sequence at index
     * Assign value to lastAnswer.
     * Print lastAnswer on new line.
     * 
     * https://www.hackerrank.com/challenges/dynamic-array/problem
     * @param n
     * @param queries
     * @return
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Integer> sequences = new ArrayList<>(n);
        int lastAnswer = 0;
        int query = queries.get(0).get(0);

        int x = queries.get(0).get(1);
        int y = queries.get(0).size() > 2 ? queries.get(0).get(2) : -1;

        int case1 = y;
        int case2 = 2 * y;

        if (query == case1) {
            int index = (x ^ lastAnswer) % n;
            sequences.add(index, y);
        }
        if (query == case2) {
            int index2 = (x ^ lastAnswer) % n;
            sequences.add(index2, y);
            lastAnswer = y % sequences.size();
            System.out.println(lastAnswer);
        }

        return sequences;
    }
}
