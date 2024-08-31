package SlidingWindow;

// TODO
public class MaxSubArraySumWithDistingElementsOfLengthK {
    private static long maximumSubarraySum(int[] nums, int k) {
        // 1 5 4 2 9 9 9
        // 0 -> 2

        int left = 0, right = k - 1, max = Integer.MIN_VALUE;

        while (right < nums.length - 1) {
            int sum = 0;

            // l -> 0, r -> 2
            // nums[0] + nums[1] + nums[2]
            // l -> 1, r -> 3

            sum = sum + nums[left];
            left++;

            if (left == right) {
                right = right + 1;
                left = left - k + 1;
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);

        return -1l;

    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
