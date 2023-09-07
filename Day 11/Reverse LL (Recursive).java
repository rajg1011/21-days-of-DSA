// Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
//  Note :
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

    public static Node<Integer> reverseRec(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> header = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return header;
    }

}