package practice;

import org.junit.Test;

import java.util.Arrays;

public class RandomStuff {

    /**
     * A given site can have a thing or not have a thing. How many different combinations
     *  of having things are there between a given site and its neighbor to the right for the entire collection
     *  of sites?
     */
    @Test
    public void testThatRandomProblem() {
        Integer combinations = 1;
        String[] sites = new String[]{null, null, null, null, null, null, null};
        System.out.println("Number of sites: " + sites.length);

        for (int i = 0; i < sites.length; i++) {
            System.out.println("*");
            combinations++;

            sites[i] = "x";
            combinations++;
            System.out.println("trip: " + Arrays.toString(sites));
            sites[i] = null;

            if (i != sites.length - 1) {
                combinations++;
                sites[i + 1] = "x";
                System.out.println("trip: " + Arrays.toString(sites));
            }
            sites[i] = "x";

            System.out.println("trip: " + Arrays.toString(sites));


            if (i != sites.length - 1) {
                sites[i + 1] = null;
            }
            sites[i] = null;


        }
        System.out.println("************************************");
        System.out.println("Total combinations: " + combinations);
        System.out.println("************************************");
    }
}
