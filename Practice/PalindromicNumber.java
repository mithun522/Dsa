package Practice;

public class PalindromicNumber {

    public static boolean isPalindrome(int n) {

        int com = 0, r;
        int fin = n;
        while(n != 0) {
            r = n%10;
            com = (com * 10) + r;
            n = n/10;
        }

        System.out.println(com);

        if(fin == com) return true;

        return false;
    }

    public static void main(String[] args) {
        int n = 12321;
        System.out.println(isPalindrome(n));
    }
}