package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class InsertNodeDoublyTest {
    @Test
    public void testing() {
        InsertNodeDoubly.DoublyLinkedList doublyLinkedList = new InsertNodeDoubly.DoublyLinkedList();
        doublyLinkedList.insertNode(2);
        doublyLinkedList.insertNode(3);
        doublyLinkedList.insertNode(4);
        doublyLinkedList.insertNode(10);
        InsertNodeDoubly.DoublyLinkedListNode result = InsertNodeDoubly.sortedInsert(doublyLinkedList.head, 1);
        Assert.assertEquals(1, result.data);
    }
}
