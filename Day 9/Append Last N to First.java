// You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
// Hint:
// Identify how many pointers you require and try traversing them to right places and connect nodes accordingly also don't forget to disconnect what's required else it could create cycles.

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

	private static int length(Node<Integer> head){
		if(head==null) return 0;
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head==null|| n==0){
			return head;
		}
		int lengthofLL= length(head);
		int remove= lengthofLL-n;
		Node<Integer> last=null;
		Node<Integer> temp=head;
		Node<Integer> newNode=null;
		int count=0;
		while(temp!=null){
			if(count==remove-1){
				last= temp;
				newNode=temp.next;
			}
			count++;
			temp=temp.next;
		}
		temp=head;
		count=0;
		while(count<lengthofLL){
			if(count==lengthofLL-1){
				temp.next=head;
			}
			count++;
			temp=temp.next;
		}
		head=newNode;
		last.next=null;
		return head;

	}

}