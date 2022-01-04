package leetcode;

import leetcode.merge2lists.ListNode;
import leetcode.merge2lists.MergeTwoLists;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MergeTwoListsTest {
    @Test
    public void mergeTwoLitsts() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNodeT = new ListNode();

        listNode2.set(listNode3);
        listNode1.set(listNode2);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);

        listNode5.set(listNode6);
        listNode4.set(listNode5);

        ListNode result = new MergeTwoLists().iterate(listNode1, listNode4);
        Assert.assertEquals("[1, 1, 2, 3, 4, 4]", result.getList().toString());
    }

    @Test
    public void mergeTwoLitsts2() {
        ListNode listNode1 = new ListNode(5);


        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(4);

        listNode5.set(listNode6);
        listNode4.set(listNode5);

        ListNode result = new MergeTwoLists().iterate(listNode1, listNode4);
        Assert.assertEquals("[1, 2, 4, 5]", result.getList().toString());
    }




    @Ignore
    public void head() {
        head(5);
    }

    private void head(int n) {
        if (n == 0) return;
        head(n - 1);
        System.out.println("n is : " + n);
    }

    @Ignore
    public void tail() {
        tail(5);
    }

    private void tail(int n) {
        if (n == 0) return;
        System.out.println("n is : " + n);
        tail(n - 1);
    }
}
