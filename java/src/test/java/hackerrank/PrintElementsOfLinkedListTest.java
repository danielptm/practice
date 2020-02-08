package hackerrank;

import org.junit.Test;

public class PrintElementsOfLinkedListTest {

    @Test
    public void testing() {
        PrintElementsOfLinkedList.SinglyLinkedList singlyLinkedList = new PrintElementsOfLinkedList.SinglyLinkedList();
        singlyLinkedList.insertNode(16);
        singlyLinkedList.insertNode(13);

        PrintElementsOfLinkedList.printLinkedList(singlyLinkedList.head);
    }
}
