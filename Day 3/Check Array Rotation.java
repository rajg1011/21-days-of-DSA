// You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.
// Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

public class Solution {

    public static int arrayRotateCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

}