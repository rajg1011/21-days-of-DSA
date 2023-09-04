// You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
/****************************************************************
 * 
 * Following is the Node class already written for the Linked List
 * 
 * class Node<T> {
 * T data;
 * Node<T> next;
 * 
 * public Node(T data) {
 * this.data = data;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Write your code here.
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        int count = 0;
        while (count < pos - 1) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            return head;
        }
        temp.next = ((temp.next).next);
        return head;
    }
}