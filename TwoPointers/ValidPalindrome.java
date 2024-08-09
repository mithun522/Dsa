package TwoPointers;

// https://leetcode.com/problems/valid-palindrome/submissions/1347227761/
public class ValidPalindrome {

    private static boolean isValidPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String compare = new String();

        for(int i = s.length() - 1; i >= 0 ; i--) {
            compare += s.charAt(i);
        }

        if(compare.equals(s)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        String s = "0P";

        System.out.println(isValidPalindrome(s));
    }
}