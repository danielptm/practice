package leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle {

    List<List<Integer>> createArray(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int l = i + 1;
            List<Integer> nal = new ArrayList<>(i);
            if (i == 0) {
                nal.add(1);
            } else {
                nal.add(0, 1);
                nal.add((nal.size() - 1), 1);
            }
            result.add(nal);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = createArray(numRows);
        for (int i = 2; i < rows.size(); i++) {
            List<Integer> previous = rows.get(i - 1);

            for (int j = 1; j < previous.size(); j++) {
                int prevInt = previous.get(j - 1);
                int thisInt = previous.get(j);
                int sum = prevInt + thisInt;
                rows.get(i).add(j, sum);
            }
        }
        return rows;
    }
}
