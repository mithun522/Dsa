package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicateLetters {

    // https://leetcode.com/problems/remove-duplicate-letters/
    private static String removeDuplicateLetters(String s) {
        String out = ""; 
        int n = s.length();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }

        Collections.sort(list);

        for(Character i : list) {
            out+=i;
        }

        return out;
    }

    public static void main(String[] args) {
        String s = "bcabcd";
        System.out.println(removeDuplicateLetters(s));
    }
}