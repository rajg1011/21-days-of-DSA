// Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
//  Note :
// // No need to print the list, it has already been taken care. Only return the new head to the list.
/***************
 * Following is the Node class already written
 * class Node<T> {
 * T data;
 * Node<T> next;
 * 
 * public Node(T data) {
 * this.data = data;
 * }
 * }
 ***************/

public class Solution {

    public static Node<Integer> reverse_I(Node<Integer> head) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> prev = head;
        Node<Integer> curr = head.next;
        while (curr != null) {
            Node<Integer> nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        head.next = null;
        return prev;
    }
}