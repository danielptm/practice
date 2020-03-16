package hackerrank;

public class InsertNodeAtHead {

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


    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode list, int data) {
        if (list == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
        singlyLinkedListNode.next = list;
        return singlyLinkedListNode;
    }
}
