// You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
// Note:
// Given array/list can contain duplicate elements. 

public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		int sum=0;
		for(int i=0; i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==num){
					sum++;
				}
			}
		}
		return sum;
	}
}