// You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N' (if it exists). Return -1 otherwise.
// Note :
// Assume that the Indexing for the singly linked list always starts from 0.
/****************************************************************
 * 
 * Following is the class structure of the Node class:
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
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        if (head == null) {
            return -1;
        }
        int count = 0;
        while (head.next != null) {
            if (head.data == n) {
                return count;
            }
            head = head.next;
            count++;
        }
        return -1;
    }

}