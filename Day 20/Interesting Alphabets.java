// Print the following pattern for the given number of rows.

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			int start = (char)('A' + n - i);
			while (j <= i) {
				System.out.print((char)start);
				start++;
                j++;
			}
			System.out.println();
			i++;
		}
	}
}