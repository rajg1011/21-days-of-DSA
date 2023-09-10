// You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

public class Solution {

    public static int[] merge(int arr1[], int arr2[]) {
        // Your code goes here
        int Arr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                Arr[k] = arr1[i];
                k++;
                i++;
            } else {
                Arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            Arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            Arr[k] = arr2[j];
            k++;
            j++;
        }
        return Arr;
    }

}