package linkedlist;

import java.util.HashSet;
import java.util.List;

public class IntersectionPoint {

    /*
    Time: O(m*n)
    Space: O(1)
     */
    public ListNode getIntersectionNodeBruteForce(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode currentA = headA;

        while(currentA != null) {
            ListNode currentB = headB;
            while(currentB != null) {
                if(currentA == currentB) {
                    return currentA;
                }

                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeOptimized(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        HashSet<ListNode> nodesSet = new HashSet();

        ListNode currentB = headB;
        while(currentB != null) {
            nodesSet.add(currentB);
            currentB = currentB.next;
        }

        ListNode currentA = headA;

        while(currentA != null) {
            if(nodesSet.contains(currentA)) {
                return currentA;
            }

            currentA = currentA.next;
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode listA = new ListNode(1);
    }
}
