// Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
// Return true or false.
// Do it recursively.
// E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.

public class Solution {
    public static boolean checkSequence(String bdi, String cti) {

        if (cti.length() == 0) {
            return true;
        }
        if (bdi.length() == 0) {
            if (cti.length() == 0) {
                return true;
            }
            return false;
        }

        boolean smallAns = false;
        int index = 0;
        for (int i = 0; i < bdi.length(); i++) {
            if (cti.charAt(0) == bdi.charAt(i)) {
                smallAns = true;
                index = i;
                break;
            }
        }
        if (!smallAns) {
            return false;
        }
        boolean ans = checkSequence(bdi.substring(index + 1), cti.substring(1));
        return ans;
    }
}