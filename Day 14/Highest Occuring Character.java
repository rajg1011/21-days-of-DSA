// For a given a string(str), find and return the highest occurring character.
// Example:
// Input String: "abcdeapapqarr"
// Expected Output: 'a'
// Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.

public class Solution {

    public static int max(int[] arr) {
        int maxi = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                index = i;
                maxi = arr[i];
            }
        }
        return index;

    }

    public static char highestOccuringChar(String str) {
        // Your code goes here
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ins = str.charAt(i);
            arr[(int) ins]++;
        }
        char ans = (char) max(arr);
        return ans;
    }

}