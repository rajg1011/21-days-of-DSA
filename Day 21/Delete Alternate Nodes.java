// Given a Singly Linked List of integers, delete all the alternate nodes in the list.
// Example:
// List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
// Alternate nodes will be:  20, 40, and 60.

// Hence after deleting, the list will be:
// Output: 10 -> 30 -> 50 -> null
/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        // Your code goes here
        Node<Integer> temp = head;
        Node<Integer> tempPre = head;
        int count = 1;
        while (temp != null) {
            if (count % 2 == 0) {
                tempPre.next = temp.next;
            }
            tempPre = temp;
            temp = temp.next;
            count++;
        }
    }
}