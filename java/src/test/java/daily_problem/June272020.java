package daily_problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class June272020 {

    int[][] mtx = new int[][]{new int[]{0, 0, 1}, new int[]{0, 0, 1}, new int[]{1, 0, 0} };

    int finalX = mtx.length - 1;
    int finalY = mtx.length - 1;


    List<String> plans = new ArrayList<>();


    int navigate() {
        for (int i = 0; i < finalX * finalY; i++) {
            generatePlan();
        }
        int counter = 0;
        for (String plan: plans) {
            boolean result = interpretSteps(plan);
            if (result) {
                counter++;
            }
        }
        return counter;
    }

    // Return true or false if the plan works or not.
    boolean interpretSteps(String plan) {
        boolean result = true;
        int currentX = 0;
        int currentY = 0;
        String[] steps = plan.split(":");
        try {
            for (int i = 0; i < steps.length; i++) {
                if (steps[i].equals("DOWN")) {
                    if (mtx[currentY + 1][currentX] == 0) {
                        currentY = currentY + 1;
                    } else {
                        result = false;
                        break;
                    }
                }
                if (steps[i].equals("RIGHT")) {
                    if (mtx[currentY][currentX + 1] == 0) {
                        currentX = currentX + 1;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An error was thrown: " + e);
            result = false;
        }
        return result;
    }

    //Find a unique plan that hasnt been generated yet.
    void generatePlan() {
        boolean planFound = false;
        StringJoiner sj = null;
        String plan = null;
        while (!planFound) {
            sj = new StringJoiner(":", "", "");
            for (int i = 0; i < finalX * finalY; i++) {
                int coin = (int) Math.floor(Math.random() * 2);
                if (coin == 0) {
                    sj.add("DOWN");
                } else if (coin == 1) {
                    sj.add("RIGHT");
                } else {
                    throw new IllegalStateException("The coin is malformed because a value was generated which is not 1 or 0. Coin: " + coin);
                }
            }
             plan = sj.toString();

            if (hasMaxRight(plan) && hasMaxDown(plan)) {
                if (!plans.contains(plan)) {
                    planFound = true;
                    plans.add(plan);
                }
            }
        }
    }

    boolean hasMaxRight(String plan) {
        String[] items = plan.split(":");
        return Arrays.stream(items).filter(item -> item.equals("RIGHT")).toArray().length > mtx.length ? false : true;

    }

    boolean hasMaxDown(String plan) {
        String[] items = plan.split(":");
        return Arrays.stream(items).filter(item -> item.equals("DOWN")).toArray().length > mtx.length ? false : true;
    }

    @Test
    public void testing() {
        int result = navigate();
        Assert.assertEquals(2, result);
    }
}
