// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.

public class Solution {

    public static void totalSum(int[][] mat) {
        // Your code goes here
        int rows = mat.length - 1;
        if (rows == -1) {
            System.out.println(0);
            return;
        }
        int cols = mat[0].length - 1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 | j == 0 | i == rows | j == cols | i == j | j == rows - i) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }

}