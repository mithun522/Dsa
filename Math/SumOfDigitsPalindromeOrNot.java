package Math;

public class SumOfDigitsPalindromeOrNot {

    // https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1?page=1&difficulty=School&sortBy=submissions
    private static int sumOfDigitsPalindromeOrNot(int num) {
        int out = 0;

        while(num > 0) {
            int digit = num % 10;
            num = num/10;
            out += digit;
        }

        StringBuilder str = new StringBuilder();

        str.append(out);
        str.reverse();

        if(Integer.parseInt(str.toString()) == out) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 98;

        System.out.println(sumOfDigitsPalindromeOrNot(n));
    }
}