package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class FindMergeNodeTest {

    @Test
    public void test() {
        FindMergeNode.SinglyLinkedList list1 = new FindMergeNode.SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);

        FindMergeNode.SinglyLinkedList list2 = new FindMergeNode.SinglyLinkedList();
        list2.insertNode(1);
        list2.head.next = list1.head.next.next;

        int result = FindMergeNode.findMergeNode(list1.head, list2.head);

        Assert.assertEquals(3, result);
    }

    @Test
    public void test2() {
        FindMergeNode.SinglyLinkedList list1 = new FindMergeNode.SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);

        FindMergeNode.SinglyLinkedList list2 = new FindMergeNode.SinglyLinkedList();
        list2.insertNode(1);
        list2.head.next = list1.head.next;

        list1.head.next = list2.head.next;


        int result = FindMergeNode.findMergeNode(list1.head, list2.head);

        Assert.assertEquals(2, result);
    }

}
