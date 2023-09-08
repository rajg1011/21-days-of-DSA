// You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
// To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
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

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {
        // Your code goes here
        if (head == null || n == 0) {
            return head;
        }
        if (m == 0) {
            return null;
        }
        int count = 0;
        Node<Integer> note = null, temp = head;
        while (temp != null) {
            if (count == m - 1) {
                note = temp;
            } else if (count == m + n) {
                note.next = temp;
                count = 0;
                note = note.next;
            }
            count++;
            temp = temp.next;
        }
        note.next = null;
        return head;

    }
}