package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void testing() {
        ReverseLinkedList.SinglyLinkedList singlyLinkedList = new ReverseLinkedList.SinglyLinkedList();
        singlyLinkedList.insertNode(1);
        singlyLinkedList.insertNode(2);
        singlyLinkedList.insertNode(3);
        singlyLinkedList.insertNode(4);
        ReverseLinkedList.SinglyLinkedListNode result = ReverseLinkedList.reverse(singlyLinkedList.head);
        Assert.assertEquals(4, result.data);
    }

    @Test
    public void testing2() {
        ReverseLinkedList.SinglyLinkedList singlyLinkedList = new ReverseLinkedList.SinglyLinkedList();
        singlyLinkedList.insertNode(1);
        singlyLinkedList.insertNode(2);
        singlyLinkedList.insertNode(3);
        singlyLinkedList.insertNode(4);
        ReverseLinkedList.SinglyLinkedListNode result = reverse(singlyLinkedList.head);
        Assert.assertEquals(4, result.data);
    }

    ReverseLinkedList.SinglyLinkedListNode reverse (ReverseLinkedList.SinglyLinkedListNode node) {
        if (node.next == null) {
            return node;
        }
        ReverseLinkedList.SinglyLinkedListNode remaining = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }

    @Test
    public void testing3FactorialRandom() {
        int fact = 5;
        int result = factorial(5);
        System.out.println(result);
    }

    int factorial (int num) {
        if (num == 1) {
            return 1;
        } else {
            int res = num * factorial(num - 1);
            return res;
        }
    }

    @Test
    public void testing3() {
        // Recursive method called here
        int x = printNum(6);
        System.out.println(x);
    }

    private static int printNum(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        n = n - 1;
        return 1 + printNum(n);
    }
}
