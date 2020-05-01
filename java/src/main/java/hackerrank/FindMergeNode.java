package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FindMergeNode {

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

    public static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int ret = 0;
        List<String> equalsValues = new ArrayList<>();
        equalsValues.add(head1.toString());
        equalsValues.add(head2.toString());


        SinglyLinkedListNode curr1 = head1.next;
        while (curr1 != null) {
            if (!equalsValues.contains(curr1.toString())) {
                equalsValues.add(curr1.toString());
            }
            curr1 = curr1.next;
        }

        SinglyLinkedListNode curr2 = head2.next;
        while (curr2 != null) {
            if (!equalsValues.contains(curr2.toString())) {
                equalsValues.add(curr2.toString());
            } else {
                ret = curr2.data;
                break;
            }
            curr2 = curr2.next;
        }

        return ret;
    }
}
