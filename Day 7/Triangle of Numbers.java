// Print the following pattern for the given number of rows.

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            int p = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            int l = p - 2;
            for (int k = 1; k < i; k++) {
                System.out.print(l);
                l--;
            }
            System.out.println();
        }
    }
}
