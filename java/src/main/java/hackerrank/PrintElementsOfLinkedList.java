package hackerrank;

public class PrintElementsOfLinkedList {

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

    /**
     * Use a linked list if there are many insert/deletions of nodes as it is faster. O(1) vs O(n)
     * Arraylist is faster for get operations. O(1) vs O(n)
     * @param head
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        System.out.println(head.data);
        if (head.next != null) {
            printLinkedList(head.next);
        }
    }
}
