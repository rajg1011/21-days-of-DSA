// Check whether a given String 'S' is a palindrome using recursion.

// Return true or false.

public class Solution {

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        boolean ans = isPalindrome(str, ++start, --end);
        if (!ans)
            return ans;
        else {
            if (str.charAt(start) == str.charAt(end))
                return true;
            else
                return false;
        }
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindrome(str, 0, str.length() - 1);
    }
}
