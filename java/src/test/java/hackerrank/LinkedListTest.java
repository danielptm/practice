package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testing() {
        LinkedList.SinglyLinkedList singlyLinkedList = new LinkedList.SinglyLinkedList();
        singlyLinkedList.insertNode(16);
        singlyLinkedList.insertNode(13);
        singlyLinkedList.insertNode(7);

        int data = 1;
        int position = 2;

        LinkedList.SinglyLinkedListNode result = LinkedList.insertNodeAtPosition(singlyLinkedList.head, data, position);

        Assert.assertEquals(1, result.next.next.data);

    }

}
