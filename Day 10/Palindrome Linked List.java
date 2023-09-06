// You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.

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

    private static int linkedList(Node<Integer> head) {
        if (head == null)
            return 0;
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    private static Node<Integer> reverse(Node<Integer> head) {
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

    public static boolean isPalindrome(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return true;
        }
        Node<Integer> temp = head;
        int i = 0;
        int n = linkedList(head);
        while (i < (n / 2) - 1) {
            temp = temp.next;
            i++;
        }
        Node<Integer> header = temp.next;
        temp.next = null;
        Node<Integer> newHead = reverse(header);
        while (newHead != null && head != null) {
            if (!newHead.data.equals(head.data)) {
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }

}