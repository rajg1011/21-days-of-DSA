
// You have been given a queue that can store integers as the data. You are required to write a function that reverses the populated queue itself without using any other data structures.
import java.util.Stack;
import java.util.Queue;

public class Solution {

    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        Stack<Integer> newStack = new Stack<>();
        while (!input.isEmpty()) {
            newStack.push(input.peek());
            input.remove();
        }
        while (!newStack.isEmpty()) {
            input.add(newStack.peek());
            newStack.pop();
        }
    }

}