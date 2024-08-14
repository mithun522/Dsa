package Array;

public class MaxSumSubArray {

    // Brute
    private static int maxSumSubArray(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n;j++) {
                sum = sum + arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // Optimized
    private static int maxSubArrayOptimized(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum < 0)
            sum = 0;

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubArrayOptimized(arr);
        System.out.println(maxSum);
    }
}