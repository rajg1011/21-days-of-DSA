// Given k, find the geometric sum i.e.
// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
// using recursion.

public class solution {

    private static double power(int n) {
        if (n == 0) {
            return 1;
        }
        return power(n - 1) * 2.00000;
    }

    public static double findGeometricSum(int k) {
        // Write your code here
        if (k == 0) {
            return 1.00000;
        }
        double answer = findGeometricSum(k - 1);
        return answer + (1 / (power(k)));
    }
}
