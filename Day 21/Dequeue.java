
// You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
// You don't need to double the capacity.
// You need to implement the following functions -
// 1. constructor
// You need to create the appropriate constructor. Size for the queue passed is 10.
// 2. insertFront -
// This function takes an element as input and insert the element at the front of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
// 3. insertRear -
// This function takes an element as input and insert the element at the end of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
// 4. deleteFront -
// This function removes an element from the front of queue. Print -1 if queue is empty.
// 5. deleteRear -
// This function removes an element from the end of queue. Print -1 if queue is empty.
// 6. getFront -
// Returns the element which is at front of the queue. Return -1 if queue is empty.
// 7. getRear -
// Returns the element which is at end of the queue. Return -1 if queue is empty.
/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/
import java.util.LinkedList;
import java.util.*;

public class Dequeue {
    // Complete this class
    private LinkedList<Integer> deque;
    private int size;

    public Dequeue(int size) {
        deque = new LinkedList<>();
        this.size = size;
    }

    public void insertFront(int elem) {
        if (deque.size() < size) {
            deque.addFirst(elem);
        } else {
            System.out.println(-1);
        }
    }

    public void insertRear(int elem) {
        if (deque.size() < size) {
            deque.addLast(elem);
        } else {
            System.out.println(-1);
        }
    }

    public void deleteFront() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            deque.removeFirst();
        }
    }

    public void deleteRear() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            deque.removeLast();
        }
    }

    public int getFront() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getFirst();
        }
    }

    public int getRear() {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getLast();
        }
    }

}