// Given a string, compute recursively a new string where all 'x' chars have been removed.

public class solution {

    // Return the changed string
    public static String removeX(String str) {
        // Write your code here
        if (str.length() <= 1) {
            if (str.isEmpty() || str.charAt(0) == 'x') {
                return "";
            } else {
                return str;
            }
        }
        if (str.charAt(0) == 'x')
            return removeX(str.substring(1));
        else
            return str.charAt(0) + removeX(str.substring(1));

    }
}
