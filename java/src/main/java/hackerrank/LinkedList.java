package hackerrank;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 */
public class LinkedList {

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

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int index = 0;
        SinglyLinkedListNode thisNode = head;
        while (index < position) {
            thisNode = thisNode.next;
            index++;
        }
        moveNodes(data, thisNode);

        return thisNode;
    }

    static void moveNodes(int data, SinglyLinkedListNode thisNode) {
        int nextData = thisNode.data;
        thisNode.data = data;
        if (thisNode != null) {
            moveNodes(nextData, thisNode.next);
        }
    }
}
