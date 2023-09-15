// Reverse the First K Elements in the Queue Using One stack 

// For a given queue containing all integer data, reverse the first K elements.
// You have been required to make the desired change in the input queue itself.
import java.util.LinkedList;
import java.util.*;

public class Solution {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Your code goes here
        Stack<Integer> stack = new Stack<>();
        int n = input.size();
        for (int i = 1; i <= k; i++) {
            stack.push(input.poll());
        }
        while (!stack.isEmpty()) {
            input.add(stack.pop());
        }
        for (int i = 1; i <= n - k; i++) {
            input.add(input.poll());
        }
        return input;
    }

}