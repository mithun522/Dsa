package Array;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubArraySum {

    // Brute
    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int sum = 0, count = 0;
            for(int j = i; j < n; j++) {
                sum += nums[j];
                count++;
                if(sum >= target ) {
                    result = Math.min(result, count);
                }
            }
        }

        if(result == Integer.MAX_VALUE) return 0;

        return result;
    }

    // TODO: should learn this approac
    private static int minSubArrayLenOptmized(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
    
        for (int right = 0; right < n; right++) {
            sum += nums[right];
    
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
    
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {

        // int[] arr = {2, 3, 1, 2, 4, 3};
        int[] arr = {1,2,3,4,5};
        System.out.println(minSubArrayLenOptmized(11, arr));
    }
    
}
