
// You have been given a queue that can store integers as the data. You are required to write a function that reverses the populated queue itself without using any other data structures.
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void reverseQueue(Queue<Integer> q) {
        // Your code goes here
        if (q.isEmpty() || q.size() == 1) {
            return;
        }
        int n = q.poll();
        reverseQueue(q);
        q.add(n);
    }

}