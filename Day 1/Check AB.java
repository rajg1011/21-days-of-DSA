// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.

public class Solution {

    public static boolean checkAB(String str) {
        // Write your code here
        if (str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == 'a') {
            if (str.length() >= 3 && str.substring(1, 3).equals("bb")) {
                return checkAB(str.substring(3));
            } else {
                return checkAB(str.substring(1));
            }
        } else {
            return false;
        }
    }
}
