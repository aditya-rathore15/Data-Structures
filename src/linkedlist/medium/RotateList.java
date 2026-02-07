package linkedlist.medium;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        // Eg: 1->2->3->4->5, k=2
        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        int length = 0; // 5
        while(current != null) {
            length++;
            current = current.next;
        }

        k = k% length; //k=2
        if(k==0) {
            return head;
        }

        ListNode slow = head; // s->1
        ListNode fast = head; // f->3

        for(int i=0; i<k; i++) {
            fast = fast.next;
        }

        while(fast.next != null) {
            fast = fast.next; // f->5
            slow = slow.next; // s->3
        }

        ListNode newHead = slow.next; //nh = 4
        slow.next = null; //1->2->3->null

        fast.next = head;//5->1->2->3->null

        return newHead; // 4->5->1->2->3->null
    }
}
