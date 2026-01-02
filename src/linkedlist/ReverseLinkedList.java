package linkedlist;

/*
Leetcode 206

Time: O(n)
Space: O(1)
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}