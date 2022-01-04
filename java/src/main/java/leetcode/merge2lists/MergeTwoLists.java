package leetcode.merge2lists;

public class MergeTwoLists {

    public ListNode iterate(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }


        ListNode currList1 = list1;
        ListNode currList2 = list2;
        ListNode currRes = result;

        while (currList1 != null && currList1.next != null) {
            if (currList1.val <= currList1.next.val) {
                currRes.val = currList1.val;
                currRes.next = new ListNode(currList1.next.val);
            } else {
                currRes.next = new ListNode(currList1.val);
                currRes.val = currList1.next.val;
            }
            currList1 = currList1.next;
            currRes = currRes.next;
        }

        return result;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       return null;
    }
}

