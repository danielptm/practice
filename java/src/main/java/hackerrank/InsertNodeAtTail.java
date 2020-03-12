package hackerrank;

public class InsertNodeAtTail {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }



    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode curr = head;
        if (head == null) {
            curr = new SinglyLinkedListNode(data);
            return curr;
        }
        if (curr.next != null) {
            insertNodeAtTail(curr.next, data);
        } else {
            curr.next = new SinglyLinkedListNode(data);
        }
        return curr;
    }
}
