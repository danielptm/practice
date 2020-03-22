package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class InsertNodeAtIndexTest {

    @Test
    public void testing() {
        InsertNodeAtIndex.SinglyLinkedList singlyLinkedListNode = new InsertNodeAtIndex.SinglyLinkedList();
        singlyLinkedListNode.insertNode(16);
        singlyLinkedListNode.insertNode(13);
        singlyLinkedListNode.insertNode(7);

        InsertNodeAtIndex.SinglyLinkedListNode result = InsertNodeAtIndex.insertNodeAtPosition(singlyLinkedListNode.head, 1, 2);

        Assert.assertNotNull(result);

    }
}
