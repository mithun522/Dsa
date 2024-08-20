package Strings.Medium;


// https://leetcode.com/problems/extra-characters-in-a-string/
public class ExtraCharactersInString {
    
    private static int minExtraChar(String s, String[] dictionary) {
        String out = s;

        for (int i = 0; i < dictionary.length; i++) {
            if(out.contains(dictionary[i])) {
                out = out.replaceAll(dictionary[i], "");
            }
        }

        return out.length();
    }

    public static void main(String[] args) {
        String str = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};

        System.out.println(minExtraChar(str, dictionary));
    }
}
