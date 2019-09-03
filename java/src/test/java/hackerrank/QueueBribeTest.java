package hackerrank;

import org.junit.Test;

public class QueueBribeTest {

    //3
    @Test
    public void testQueueBribe() {
        //2 1 5 3 4
        int[] input = new int[]{2,1,5,3,4};
        QueueBribe.minimumBribes(input);
    }

    //Too chaotic
    @Test
    public void testQueueBribe2() {
        //2 1 5 3 4
        int[] input = new int[]{2,5,1,3,4};
        QueueBribe.minimumBribes(input);
    }

    //Too chaotic
    @Test
    public void testQueueBribe3() {
        //2 1 5 3 4
        int[] input = new int[]{5,1,2,3,7,8,6,4};
        QueueBribe.minimumBribes(input);
    }

    /**
     * This test is suppose to print 7 but prints 6.
     * As far as I can tell it should be printing 6, but
     * hacker rank says it should print 7.
     */
    //7
    @Test
    public void testQueueBribe4() {
        //2 1 5 3 4
        int[] input = new int[]{1,2,5,3,7,8,6,4};
        QueueBribe.minimumBribes(input);
    }
}
