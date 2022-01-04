package leetcode.merge2lists;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void set(ListNode listNode) {
        this.next = listNode;
    }

    public List<Integer> getList() {
        List<Integer> nums = new ArrayList<>();

        ListNode curr = this;
        while (curr !=null) {
            nums.add(curr.val);
            curr = curr.next;

        }
        return nums;
    }
}
