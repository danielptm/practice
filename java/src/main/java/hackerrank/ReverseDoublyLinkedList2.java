package hackerrank;

public class ReverseDoublyLinkedList2 {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head.next == null) {
            return head;
        }
        DoublyLinkedListNode newHead = reverse(head.next);
        findNewEndAndSet(newHead, head);
        return newHead;
    }

    public static void findNewEndAndSet(DoublyLinkedListNode newHead, DoublyLinkedListNode head) {
        if (newHead.next == null) {
            newHead.next = new DoublyLinkedListNode(head.data);
            return;
        }
        findNewEndAndSet(newHead.next, head);
    }
}
