// For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
// If the expression can't be balanced, return -1.
// Example:
// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

// Expression: {{{
// In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
import java.util.Stack;

public class Solution {

    public static int countBracketReversals(String str) {
        // Your code goes here
        if (str.length() % 2 != 0) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(i));
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        int count = 0;
        while (!stack.isEmpty()) {
            char c1 = stack.peek();
            stack.pop();
            char c2 = stack.peek();
            stack.pop();
            if (c1 == '{' && c2 == '}')
                count += 2;
            else if (c1 == '}')
                count += 1;
            else if (c2 == '{')
                count += 1;
        }
        return count;

    }

}