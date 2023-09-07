// Given a singly linked list of integers, sort it using 'Merge Sort.'
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
/*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    private static Node<Integer> midOfLL(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;
        Node<Integer> head = null, tail = null;
        if (head1.data <= head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        if (head1 == null) {
            tail.next = head2;
        } else if (head2 == null) {
            tail.next = head1;
        }
        return head;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        Node<Integer> beech = midOfLL(head);
        Node<Integer> headNextToMiddle = beech.next;
        beech.next = null;
        Node<Integer> head1 = mergeSort(head);
        Node<Integer> head2 = mergeSort(headNextToMiddle);
        Node<Integer> newHead = merge(head1, head2);
        return newHead;

    }

}