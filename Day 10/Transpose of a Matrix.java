
// You are given a matrix ‘MAT’. Print the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].

public class Solution {

    public static int[][] transpose(int m, int n, int[][] arr) {
        // Write your code here
        int[][] newArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        return newArr;
    }

}
