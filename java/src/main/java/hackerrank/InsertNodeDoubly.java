package hackerrank;

public class InsertNodeDoubly {
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


    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if (head == null) {
            return head;
        }
        if (data < head.data && head.prev == null) {
            DoublyLinkedListNode dn = new DoublyLinkedListNode(data);
            dn.next = head;
            return dn;
        }
        if ((head.next != null) && data > head.data && data <= head.next.data) {
            DoublyLinkedListNode doublyLinkedListNode = new DoublyLinkedListNode(data);
            DoublyLinkedListNode oldNext = head.next;
            doublyLinkedListNode.next = oldNext;
            head.next = doublyLinkedListNode;
            return head;
        }
        if (head.next == null) {
            head.next = new DoublyLinkedListNode(data);
            return head;
        }
        DoublyLinkedListNode resulthead = sortedInsert(head.next, data);
        DoublyLinkedListNode prev = resulthead.prev != null ? resulthead.prev : resulthead;
        return prev;
    }


}
