// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.


public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */

	//  if(n==1) return 1;
	//  if(n==2) return 2;
	//  if(n==3) return 4;
	if(n==0) return 1;
	if(n<0) return 0;
	 return staircase(n-3)+staircase(n-2)+staircase(n-1);
	}
	
}