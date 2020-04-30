package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class ReverseDoublyLinkedList2Test {
    @Test
    public void testing() {
        ReverseDoublyLinkedList2.DoublyLinkedList list = new ReverseDoublyLinkedList2.DoublyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        ReverseDoublyLinkedList2.DoublyLinkedListNode result = ReverseDoublyLinkedList2.reverse(list.head);
        Assert.assertEquals(4, result.data);
    }
}
