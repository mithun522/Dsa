package Strings;

public class RemoveDuplicates {

    private static String removeDuplicates(String str) {
        StringBuilder out = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            if(out.indexOf(Character.toString(currentChar)) == -1) {
                out.append(currentChar);
            }
        }
        
        return out.toString();
    }

    public static void main(String[] args) {
        String str = "geEksforGEeks";
        System.out.println(removeDuplicates(str));
    }
}