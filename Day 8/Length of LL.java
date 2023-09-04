// Given the head of a singly linked list of integers, find and return its length.
/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static int length(Node head) {
        // Your code goes here
        if (head == null) {
            return 0;
        }
        int count = 0;
        while (head.next != null) {
            head = head.next;
            count++;
        }
        return count + 1;
    }
}