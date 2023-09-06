// You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
// To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.
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

    public static void printReverse(Node<Integer> head) {
        // Your code goes here
        if (head == null) {
            return;
        }
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

}