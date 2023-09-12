// For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.

// Example:
// Expression: (()())
// Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
// You need to return a boolean value indicating whether the expression is balanced or not.
// Note:
// The input expression will not contain spaces in between.
import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String expression) {
        // Your code goes here
        Stack<Character> paranthesis = new Stack<>();
        int i = 0;
        paranthesis.push('R');
        boolean ans = true;
        while (i < expression.length()) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
                paranthesis.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (paranthesis.peek() != '(') {
                    return false;
                } else {
                    paranthesis.pop();
                }
            } else if (expression.charAt(i) == '}') {
                if (paranthesis.peek() != '{') {
                    return false;
                } else {
                    paranthesis.pop();
                }
            } else if (expression.charAt(i) == ']') {
                if (paranthesis.peek() != '[') {
                    return false;
                } else {
                    paranthesis.pop();
                }
            }
            i++;
        }
        if (paranthesis.size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}