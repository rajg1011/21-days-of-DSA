// For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
//  Note :
// Assume that the Indexing for the singly linked list always starts from 0.

// If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.

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

    public static void printIthNode(Node<Integer> head, int i) {
        if (head == null) {
            return;
        }
        Node<Integer> temp = head;
        int count = 0;
        while (count < i) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println(temp.data);
    }
}