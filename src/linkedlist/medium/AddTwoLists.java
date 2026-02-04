package linkedlist.medium;

import linkedlist.medium.ListNode;

public class AddTwoLists {
    public ListNode addTwoLists(ListNode l1, ListNode l2) {
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        int carry = 0;

        while(currentL1 != null || currentL2 != null || carry != 0) {
            int x = (currentL1 != null) ? currentL1.data : 0;
            int y = (currentL2 != null) ? currentL2.data : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            int digit = sum % 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            if(currentL1 != null) currentL1 = currentL1.next;
            if(currentL2 != null) currentL2 = currentL2.next;
        }

        return dummy.next;
    }
}
