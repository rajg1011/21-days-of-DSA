// Implement a Stack Data Structure specifically to store integer data using a Singly Linked List.
// The data members should be private.
// You need to implement the following public functions :
// 1. Constructor:
// It initialises the data members as required.
// 2. push(data) :
// This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
// 3. pop() :
// It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
// 4. top :
// It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
// 5. size() :
// It returns the size of the stack at any given instance of time.
// 6. isEmpty() :
// It returns a boolean value indicating whether the stack is empty or not.



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

public class Stack {

    //Define the data members
    Node head;
    int count;


    public Stack() {
        //Implement the Constructor
        head=null;
        count=-1;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return count+1;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return count==-1;
    }

    public void push(int element) {
        //Implement the push(element) function
        if(head==null){
            Node newNode= new Node(element);
            head=newNode;
            count++;
            return;
        }
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        count++;
    }

    public int pop() {
        if(getSize()==0){
            return -1;
        }
        int temp= head.data;
        head=head.next;
        count--;
        return temp;
    }

    public int top()  {
        if(getSize()==0){
            return -1;
        }
        return head.data;
    }
}