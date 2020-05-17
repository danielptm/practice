package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedLinkedListsTest {
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

    public SinglyLinkedList getList1() {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);
        return list1;
    }

    public SinglyLinkedList getList2() {
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertNode(2);
        list2.insertNode(3);
        list2.insertNode(4);
        return list2;
    }

    //TODO Go through this in debugger
    @Test
    public void testing() {
        SinglyLinkedList list1 = getList1();
        SinglyLinkedList list2 = getList2();

        SinglyLinkedListNode result = mergeLists(list1.head, list2.head);

        Assert.assertEquals(1, result.data);


    }


    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        return null;
    }

    @Test
    public void testing2() {
        int x = recurse(1);
        String t = null;
    }

    int recurse(int i) {
        if (i == 5) {
            return i;
        }
        if (i > 5) {
            return -1;
        }
        int y = i + 3;
        int x = recurse(y);
        return x;
    }

}
