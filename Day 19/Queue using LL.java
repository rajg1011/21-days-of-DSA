// Implement a Queue Data Structure specifically to store integer data using a Singly Linked List.
// The data members should be private.
// You need to implement the following public functions :
// 1. Constructor:
// It initialises the data members as required.
// 2. enqueue(data) :
// This function should take one argument of type integer. It enqueues the element into the queue and returns nothing.
// 3. dequeue() :
// It dequeues/removes the element from the front of the queue and in turn, returns the element being dequeued or removed. In case the queue is empty, it returns -1.
// 4. front() :
// It returns the element being kept at the front of the queue. In case the queue is empty, it returns -1.
// 5. getSize() :
// It returns the size of the queue at any given instance of time.
// 6. isEmpty() :
// It returns a boolean value indicating whether the queue is empty or not.
// Operations Performed on the Stack:
// Query-1(Denoted by an integer 1): Enqueues an integer data to the queue.

// Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the queue and returns it to the caller.

// Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the front of the queue but doesn't remove it, unlike the dequeue function.

// Query-4(Denoted by an integer 4): Returns the current size of the queue.

// Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the queue is empty or not.
/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {

    // Define the data members
    Node head;
    Node tail;
    int size;

    public Queue() {
        // Implement the Constructor
        head = null;
        tail = null;
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        // Implement the enqueue(element) function
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
        size++;
    }

    public int dequeue() {
        // Implement the dequeue() function
        if (size == 0) {
            return -1;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return temp.data;
    }

    public int front() {
        // Implement the front() function
        if (head == null) {
            return -1;
        }
        return head.data;
    }
}
