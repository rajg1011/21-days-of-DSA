// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

public class Solution {

    public static String reverse(String str, int start, int end) {
        String str1 = "";
        while (end >= start) {
            str1 += str.charAt(end);
            end--;
        }
        return str1;
    }

    public static String reverseEachWord(String str) {
        // Your code goes here
        String str1 = "";
        int i = 0;
        int j = 0;
        while (j < str.length()) {
            if (str.charAt(j) == ' ' || j == str.length() - 1) {
                if (str.charAt(j) == ' ')
                    str1 = str1 + reverse(str, i, j - 1) + " ";
                else
                    str1 = str1 + reverse(str, i, j);
                j++;
                i = j;
            } else {
                j++;
            }
        }
        return str1;
    }

}