// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
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

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Your code goes here
        if (head == null)
            return head;
        Node<Integer> temp = head;
        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }
        if (evenHead == null || oddHead == null) {
            return head;
        }

        oddTail.next = null;
        evenTail.next = null;
        oddTail.next = evenHead;
        return oddHead;
    }
}