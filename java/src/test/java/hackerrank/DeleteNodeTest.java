package hackerrank;

import org.junit.Test;

public class DeleteNodeTest {
    @Test
    public void testing() {
        DeleteNode.SinglyLinkedList singlyLinkedList = new DeleteNode.SinglyLinkedList();
        singlyLinkedList.insertNode(1);
        singlyLinkedList.insertNode(2);
        singlyLinkedList.insertNode(3);
        singlyLinkedList.insertNode(4);
        singlyLinkedList.insertNode(5);

        DeleteNode.SinglyLinkedListNode result = DeleteNode.deleteNode(singlyLinkedList.head, 3);

        String x = null;
    }
}
