// Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
//  Note :
// Assume that the Indexing for the linked list always starts from 0.

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

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        // Your code goes here
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        head.next = deleteNodeRec(head.next, pos - 1);
        return head;

    }

}