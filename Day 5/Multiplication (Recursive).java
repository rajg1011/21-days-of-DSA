// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.


public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m==0 || n==0){
			return 0;
		}
		return m+multiplyTwoIntegers(m,n-1);
	}
}
