package linkedlist;

/*
Leetcode 206

Time: O(n)
Space: O(1)
 */
public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node previous = null;
        Node current = head;

        while(current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}