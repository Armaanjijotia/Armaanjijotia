
class Solution {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        String longest = "";

        // check all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (isPalindrome(sub)) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }
        return longest;
    }

    // check if string is palindrome
    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
