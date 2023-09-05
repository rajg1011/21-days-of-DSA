// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
class Solution {
    public static void sort012(int a[], int n) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                count0++;
            else if (a[i] == 1)
                count1++;
            else
                count2++;
        }

        for (int i = 0; i < n; i++) {
            if (i < count0) {
                a[i] = 0;
            } else if (i >= count0 && i < count0 + count1) {
                a[i] = 1;
            } else {
                a[i] = 2;
            }
        }
    }
}