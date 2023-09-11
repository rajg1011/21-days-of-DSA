// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

public class solution {

    // Return the updated string
    public static String addStars(String str) {
        // Write your code here
        if (str.length() == 0) {
            return "";
        }
        String ans = addStars(str.substring(1));
        if (ans.isEmpty() || str.charAt(0) != ans.charAt(0)) {
            String newans = "";
            newans += str.charAt(0);
            for (int i = 0; i < ans.length(); i++) {
                newans += ans.charAt(i);
            }
            return newans;
        } else {
            String newans = "";
            newans += str.charAt(0);
            newans += "*";
            for (int i = 0; i < ans.length(); i++) {
                newans += ans.charAt(i);
            }
            return newans;
        }
    }
}
