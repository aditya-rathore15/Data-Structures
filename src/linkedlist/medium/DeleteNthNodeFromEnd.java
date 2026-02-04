package linkedlist.medium;

public class DeleteNthNodeFromEnd {
    public ListNode deleteNthNodeFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode slowPointer = dummyNode;
        ListNode fastPointer = dummyNode;

        while(n > 0) {
            fastPointer = fastPointer.next;
            n--;
        }

        while(fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return dummyNode.next;
    }
}
