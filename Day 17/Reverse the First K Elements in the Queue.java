// For a given queue containing all integer data, reverse the first K elements.
// You have been required to make the desired change in the input queue itself.

import java.util.Stack;
import java.util.Queue;

public class Solution {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Your code goes here
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int n = input.size() - k;
        while (!input.isEmpty()) {
            stack1.push(input.peek());
            input.remove();
        }
        for (int i = 0; i < n; i++) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        for (int i = 0; i < k; i++) {
            input.add(stack1.peek());
            stack1.pop();
        }
        while (!stack2.isEmpty()) {
            input.add(stack2.peek());
            stack2.pop();
        }
        return input;
    }

}