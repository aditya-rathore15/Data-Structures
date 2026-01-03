package linkedlist;

public class PalindromeList {
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode newNode = new  ListNode(current.data);
            newNode.next = previous;
            previous = newNode;
            current = current.next;
        }

        return previous;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode reverseHead = reverse(head);

        ListNode current1 = head;
        ListNode current2 = reverseHead;

        while(current1 != null && current2 != null){
            if(current1.data != current2.data){
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }
}
