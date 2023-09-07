// Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.
// Follow a recursive approach to solve this.
// Note :
// Assume that the Indexing for the linked list always starts from 0.

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

    public static int findNodeRec(Node<Integer> head, int n) {
        // Your code goes here
        if (head == null) {
            return -1;
        }
        if (head.data.equals(n)) {
            return 0;
        }
        int ans = findNodeRec(head.next, n);
        if (ans != -1)
            return ans + 1;
        else
            return -1;
    }

}