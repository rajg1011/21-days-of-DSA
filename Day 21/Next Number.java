// Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
// Note: You don't need to print the elements, just update the elements and return the head of updated LL.
/***************
 * Following is the Node class already written
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 ***************/

public class Solution {

    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> pre = head;
        LinkedListNode<Integer> cur = head.next;
        while (cur != null) {
            LinkedListNode<Integer> nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        head.next = null;
        return pre;
    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        LinkedListNode<Integer> tail = head;
        int count = 0;
        int length = 0;
        while (tail.next != null) {
            if (head.data == 9 && tail.data == 9) {
                count++;
            }
            length++;
            tail = tail.next;
        }
        if (tail.data < 9) {
            tail.data++;
            return head;
        }
        if (count == length) {
            LinkedListNode<Integer> tail2 = head;
            LinkedListNode<Integer> lastNode = new LinkedListNode(0);
            while (tail2 != null) {
                if (tail2 == head) {
                    head.data = 1;
                } else {
                    tail2.data = 0;
                }
                tail2 = tail2.next;
            }
            tail.next = lastNode;
            return head;
        } else {
            LinkedListNode<Integer> newHead = reverse(head);
            LinkedListNode<Integer> temp = newHead;
            while (temp.next != null) {
                if (temp.data == 9) {
                    temp.data = 0;
                } else {
                    temp.data++;
                    break;
                }
                temp = temp.next;

            }
            LinkedListNode<Integer> anotherHead = reverse(newHead);
            return anotherHead;
        }
    }

}
