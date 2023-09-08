// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

public class Solution {

    public static void arrange(int[] arr, int n) {
        // Your code goes here
        int left = 0, right = n - 1, num = 1;
        while (left < right) {
            if (left == right) {
                arr[left] = n;
            } else {
                arr[left] = num;
                left++;
                num++;
                arr[right] = num;
                right--;
                num++;
            }
        }

    }
}