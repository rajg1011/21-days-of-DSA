// Given an array A of size n and an integer K, return all subsets of A which sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

public class solution {
    private static int[][] subsetsSumK(int arr[], int k, int start) {
        if (start == arr.length - 1) {
            if (k == 0) {
                return new int[1][0];
            }
            if (k == arr[start]) {
                int[][] ans = { { arr[start] } };
                return ans;
            } else {
                int[][] ans = new int[0][0];
                return ans;
            }
        }
        int[][] newAnsNotInclude = subsetsSumK(arr, k, start + 1);
        int[][] newAnsInclude = subsetsSumK(arr, k - arr[start], start + 1);
        int[][] ans = new int[newAnsNotInclude.length + newAnsInclude.length][];
        for (int i = 0; i < newAnsNotInclude.length; i++) {
            ans[i] = new int[newAnsNotInclude[i].length];
            for (int j = 0; j < newAnsNotInclude[i].length; j++) {
                ans[i][j] = newAnsNotInclude[i][j];
            }
        }

        for (int i = newAnsNotInclude.length; i < ans.length; i++) {
            ans[i] = new int[newAnsInclude[i - newAnsNotInclude.length].length + 1];
            ans[i][0] = arr[start];
            for (int j = 0; j < newAnsInclude[i - newAnsNotInclude.length].length; j++) {
                ans[i][j + 1] = newAnsInclude[i - newAnsNotInclude.length][j];
            }
        }
        return ans;
    }

    public static int[][] subsetsSumK(int arr[], int k) {
        // Write your code here
        return subsetsSumK(arr, k, 0);
    }
}
