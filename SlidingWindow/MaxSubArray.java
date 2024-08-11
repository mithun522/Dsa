package SlidingWindow;

public class MaxSubArray {

    // Brute Force Approach;
    // private static int maxSubArray(int[] arr) {
    //     int n = arr.length, max = Integer.MIN_VALUE;

    //     for(int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for(int j = i; j < n; j++)  {
    //             sum = sum + arr[j];
    //             max = Math.max(max, sum);
    //         }
    //     }

    //     return max;
    // }

    // Better Approach
    private static int maxSubArrayBetter(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0)
            currentSum = 0;
        }

        return maxSum;
    }

    // // Optimized Solution
    // private static int maxSubArrayOptimized(int[] arr) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int currentSum = 0;

    //     for (int num : arr) {
    //         currentSum = Math.max(currentSum + num, num);
    //         maxSum = Math.max(maxSum, currentSum);
    //     }

    //     return maxSum;
    // }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArrayBetter(arr));
    }
}
