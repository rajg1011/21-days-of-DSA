// You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
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

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        // Your code goes here
        if (head == null)
            return head;
        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head.next;
        while (temp2 != null) {
            if (temp1.data.equals(temp2.data)) {
                temp1.next = temp2.next;
                temp2 = temp2.next;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return head;
    }

}