// Write a recursive function that returns the sum of the digits of a given integer.

public class solution {

    public static int sumOfDigits(int n) {
        // Write your code here
        if (n < 10)
            return n;
        return n % 10 + sumOfDigits(n / 10);

    }
}
