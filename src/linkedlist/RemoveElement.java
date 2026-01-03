package linkedlist;

public class RemoveElement {
    public ListNode removeElement(ListNode head, int val) {
        if(head == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null) {
            if(current.next.data ==  val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
