package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LinkedListWithCycle {

    public static class Node {
        int data;
        Node next;
    }

    public static boolean hasCycle(Node head) {
        // Complete this function
        // Do not write the main method
        if (head == null) {
            return false;
        }
        Node curr = head;
        List<String> items = new ArrayList<>();
        items.add(curr.toString());

        while (curr.next != null) {
            curr = curr.next;
            if (items.contains(curr.toString())) {
                return true;
            } else {
                items.add(curr.toString());
            }
        }
        return false;
    }

}
