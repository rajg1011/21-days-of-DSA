// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
//  Note:
// Change in the input array/list itself. You don't need to return or print the elements.


public class Solution {  

    private static void reverse(int[]arr, int start, int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
        public static void rotate(int[] arr, int d) {
            //Your code goes here
            int i=0;
            int j=arr.length-1;
            reverse(arr,i,j);
            int k=0;
            int l= arr.length-1-d;
            reverse(arr,k,l);
            int m=arr.length-d;
            int n=arr.length-1;
            reverse(arr,m,n);
        }
    
    
    }