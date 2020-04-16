package hackerrank;

import org.junit.Test;

public class PrintInReverseTest {
    @Test
    public void testing() {
        PrintInReverse.SinglyLinkedListNode node1 = new PrintInReverse.SinglyLinkedListNode(1);
        PrintInReverse.SinglyLinkedListNode node2 = new PrintInReverse.SinglyLinkedListNode(2);
        PrintInReverse.SinglyLinkedListNode node3 = new PrintInReverse.SinglyLinkedListNode(3);
        node2.next = node3;
        node1.next = node2;

        PrintInReverse.reversePrint(node1);
    }
}
