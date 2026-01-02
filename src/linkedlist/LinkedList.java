package linkedlist;

public class LinkedList {
    private ListNode head;

    public void insertAtBeginning(int data) {
        if (head == null) {
            head = new ListNode(data);
        }

        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }

        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAt(int position, int data) {
        if (position == 0) {
            insertAtBeginning(data);
        }

        ListNode newNode = new ListNode(data);
        ListNode current = head;

        while(position > 0) {
            current = current.next;
            position--;
        }

        if(current == null) {
            throw new IndexOutOfBoundsException("Position out of bounds!");
        }

        newNode.next = current .next;
        current.next = newNode;
    }

    public void deleteFirst() {
        if(head == null) return;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) return;

        if (head.next == null) return;

        ListNode current = head;

        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void deleteByValue(int value) {
        if(head == null) return;

        if(head.data == value) {
            head = head.next;
            return;
        }

        ListNode current = head;

        while(current.next != null && current.next.data != value) {
            current = current.next;
        }

        if(current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean search(int value) {
        ListNode current = head;

        while(current != null) {
            if(current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        ListNode current = head;

        while(current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtBeginning(5);
        linkedList.insertAt(2, 15);

        linkedList.deleteByValue(15);
        linkedList.deleteLast();;

    }
}
