import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n / 2;
        int n2 = n - n1;
        for (int i = 1; i <= n2; i++) {
            for (int spaces = 1; spaces <= n2 - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int k = 1; k < i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= n1; i++) {
            for (int spaces = 1; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int j = n1 - i + 1; j > 0; j--) {
                System.out.print('*');
            }
            for (int k = n1 - i; k > 0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}