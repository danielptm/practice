package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PrintInReverse {

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
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

    static void reversePrint(SinglyLinkedListNode head) {
        List<Integer> nums = new ArrayList<>();

        nums.add(head.data);
        SinglyLinkedListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
            nums.add(curr.data);
        }
        for(int i = nums.size() - 1; i >=0; i--) {
            System.out.println(nums.get(i));
        }
    }
}
