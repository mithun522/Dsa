package BinarySearch;

public class FindSmallestElementGreaterThenTarget {

    private static char nextGreatestLetter(char[] letters, char target) {
        int tar = (int) target, n = letters.length, result = Integer.MAX_VALUE, temp = 0;

        for (int i = 0; i < n; i++) {
            temp = (int) letters[i] - tar;

            result = Math.min(temp, result);
        }

        return (char) (target + result);
    }
    
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};

        System.out.println(nextGreatestLetter(letters, 'c'));
    }
}
