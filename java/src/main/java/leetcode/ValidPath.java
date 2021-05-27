package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/
public class ValidPath {
    public boolean hasValidPath(int[][] grid) {

        Map<Integer, int[][]> compatibles = getMapping();

        boolean isFound = false;

        int currX = 0;
        int currY = 0;

        try {

            while (!isFound) {
                int[] nextXY = getNextSquareCoord(currX, currY);
                if (isAtEnd(grid, currX, currY)) {
                    return true;
                }
                if (isLeading(compatibles, grid, currX, currY, nextXY[0], nextXY[1])) {
                    currX = nextXY[0];
                    currY = nextXY[1];
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: ");
            System.out.println(e);
            return false;
        }

        return false;
    }

    /**
     * Returns the next x,y coordinates based on the current streeth value.
     *
     * @param currX
     * @param currY
     * @return
     */
    int[] getNextSquareCoord(int currX, int currY) {
        int[] nextXY = new int[2];

        return null;
    }


    /**
     * Returns true if the current street value and the next street value line up
     * correctly.
     * @param currX
     * @param currY
     * @param nextX
     * @param nextY
     * @return
     */
    boolean isLeading(Map<Integer, int[][]> map, int[][] grid, int currX, int currY, int nextX, int nextY) {
        int thisStreetType = grid[currY][currX];
        int nextStreetType = grid[nextY][nextX];

        List<Integer> prev = Arrays.stream(map.get(thisStreetType)[0])
                .boxed().collect(Collectors.toList());

        List<Integer> next = Arrays.stream(map.get(thisStreetType)[1])
                .boxed().collect(Collectors.toList());

        if (prev.contains(nextStreetType) || next.contains(nextStreetType)) {
            return true;
        }
        return false;
    }

    boolean isAtEnd(int[][] grid, int currX, int currY) {
        int gridLength = grid.length;
        int gridWidth = grid[0].length;

        if ((gridLength - 1 == currY) && (gridWidth - 1 == currX)) {
            return true;
        }
        return false;
    }

    /**
     * The returned mapping is a set of rules for each street type.
     * The array at position 0 corresponds to the North direction or the
     * @return
     */
    Map<Integer, int[][]> getMapping() {
        Map<Integer, int[][]> compatibles = new HashMap<>();
        compatibles.put(1, new int[][]{new int[]{4, 6}, new int[]{3, 5}});
        compatibles.put(2, new int[][]{new int[]{3, 4}, new int[]{5, 6}});
        compatibles.put(3, new int[][]{new int[]{4, 6, 1}, new int[]{5, 6, 2}});
        compatibles.put(4, new int[][]{new int[]{6, 5, 2}, new int[]{3, 5, 1}});
        compatibles.put(5, new int[][]{new int[]{6, 4, 1}, new int[]{3, 4, 2}});
        compatibles.put(6, new int[][]{new int[]{4, 3, 2}, new int[]{5, 3, 1}});
        return compatibles;
    }
}
