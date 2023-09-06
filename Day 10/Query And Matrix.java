// You are given a binary matrix with ‘M’ rows and ‘N’ columns initially consisting of all 0s. 'Q' queries follow. The queries can be of 4 types:
// Query 1: 1 R index
// Query 2: 1 C index 
// Query 3: 2 R index
// Query 4: 2 C index

// In each query, the first input is the type of the query, the second input is whether we have to consider the row ('R') or the column ('C') and the third input is the index of the row/column. 

// For each type 1 query, we need to flip the elements of the row/column having the given index. 

// For each type 2 query, we have to output the number of zeros present in the row/column having the given index. 
// Note:
// Note that the matrix is a binary matrix, meaning that it only contains either 0 or 1.

import java.util.*;

public class Solution {

    public static int[] query(int[][] mat, int m, int n, String[] q) {
        int size = q.length;
        int[] arr = new int[size];
        int j = 0;

        for (int k = 0; k < size; k++) {
            String s = q[k];
            char type = s.charAt(0);
            char rowOrColumn = s.charAt(1);
            int index = s.charAt(2) - '0';

            if (type == '1') {
                if (rowOrColumn == 'R') {
                    for (int i = 0; i < n; i++) {
                        mat[index][i] = (mat[index][i] == 0) ? 1 : 0;
                    }
                } else if (rowOrColumn == 'C') {
                    for (int i = 0; i < m; i++) {
                        mat[i][index] = (mat[i][index] == 0) ? 1 : 0;
                    }
                }
            } else if (type == '2') {
                int count = 0;
                if (rowOrColumn == 'R') {
                    for (int i = 0; i < n; i++) {
                        if (mat[index][i] == 0) {
                            count++;
                        }
                    }
                } else if (rowOrColumn == 'C') {
                    for (int i = 0; i < m; i++) {
                        if (mat[i][index] == 0) {
                            count++;
                        }
                    }
                }
                arr[j++] = count;
            }
        }

        int[] ans = new int[j];
        for (int i = 0; i < j; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }

}
