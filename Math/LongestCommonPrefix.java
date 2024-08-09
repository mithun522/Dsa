package Math;

import java.util.Arrays;

public class LongestCommonPrefix {

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int index = 0;

        while (index < strs[0].length()) {
            if(strs[0].charAt(index) == strs[strs.length - 1].charAt(index)) {
                index++;
            } else break;

        }

        return index != 0 ? strs[0].substring(0, index) : "";
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}