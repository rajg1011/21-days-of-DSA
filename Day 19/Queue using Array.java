
public class Queue {

    // Define the data members
    int[] array;
    int front;
    int end;
    int size;

    public Queue() {
        // Implement the Constructor
        array = new int[5];
        front = -1;
        end = -1;
        size = 0;
    }

    public Queue(int capacity) {
        // Implement the Constructor
        array = new int[capacity];
        front = -1;
        end = -1;
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return (size == 0);
    }

    public void enqueue(int data) {
        // Implement the enqueue(element) function
        if (size == array.length) {
            doubelArray();
        }
        if (size == 0) {
            front = 0;
        }
        size++;
        end = (end + 1) % array.length;
        array[end] = data;
    }

    private void doubelArray() {
        int temp[] = array;
        array = new int[temp.length * 2];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            array[index] = temp[i];
            index++;
        }
        for (int i = 0; i < front; i++) {
            array[index] = temp[i];
            index++;
        }
        front = 0;
        end = temp.length - 1;
    }

    public int dequeue() {
        // Implement the dequeue() function
        if (front == -1) {
            return -1;
        }
        int temp = array[front];
        front = (front + 1) % array.length;
        size--;
        if (front == end) {
            front = -1;
            end = -1;
        }
        return temp;
    }

    public int front() {
        // Implement the front() function
        if (front == -1) {
            return -1;
        }
        return array[front];
    }
}
