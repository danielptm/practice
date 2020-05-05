package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListWithCycleTest {

    @Test
    public void testinv(){
        LinkedListWithCycle.Node node1 = new LinkedListWithCycle.Node();
        node1.data = 1;
        LinkedListWithCycle.Node node2 = new LinkedListWithCycle.Node();
        node2.data = 2;
        LinkedListWithCycle.Node node3 = new LinkedListWithCycle.Node();
        node3.data = 3;
        LinkedListWithCycle.Node node4 = new LinkedListWithCycle.Node();
        node4.data = 4;
        LinkedListWithCycle.Node node5 = new LinkedListWithCycle.Node();
        node5.data = 5;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        boolean result = LinkedListWithCycle.hasCycle(node1);

        Assert.assertTrue(result);

    }
}
