package interview;

public class Interview_1 {

    private static int findSmallestNDigitNumberDivisibleByK(int n, int k) {
        int digits = 0;
        String str = "1";

        for (int i = 0; i < n - 1; i++) {
            str += '0';
        }

        digits = Integer.parseInt(str);
        System.out.println(digits);

        for (int i = digits;; i++) {
            if (i % k == 0) return i;
        }
    }

    private static int findSmallestNDigitNumberDivisibleByKBetter(int n, int k) {
        int digits = (int) Math.pow(10, n);

        for (int i = digits; ; i++) {
            if(i % k == 0) return i;
        }
    }

    private static int findSmallestNDigitNumberDivisibleByKOptimized(int n, int k) {
        return -1;
    }

    private static int findLongestContinuousIncreasingSubsequence(int[] arr) {
        int n = arr.length, count = 1, max = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        /*
         * find the smallest n digit number divisible by k
         */
        int n = 4, k = 5;
        // System.out.println(findSmallestNDigitNumberDivisibleByKOptimized(n, k));

        /*
         * Find longest continuous increasing subsequence
         */
        int[] arr = {1, 3, 5, 4, 7};
        System.out.println(findLongestContinuousIncreasingSubsequence(arr));
    }
}

