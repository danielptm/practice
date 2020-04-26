package hackerrank;

public class ReverseLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        SinglyLinkedListNode remaining = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return remaining;
    }
}
