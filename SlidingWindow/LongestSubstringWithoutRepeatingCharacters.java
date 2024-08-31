package SlidingWindow;

public class LongestSubstringWithoutRepeatingCharacters {
    
    // TODO
    private static int longestSubstringWithoutRepeatingCharacters(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                temp+=str.charAt(j);
            }
            System.out.println();
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeatingCharacters(str));
    }
}
