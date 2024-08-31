package Practice;

import java.util.Arrays;

public class FindPairs {

    private static int findPairs(int[] nums, int k) {
        int n = nums.length, start = 0, end = n - 1, count = 0;
        Arrays.sort(nums);

        while (start < end) {
            if (nums[start] + nums[end] == k) {
                count++;
                start++;
            } else if (nums[start] + nums[end] > k) {
                end--;
            } else {
                start++;
                end--;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 4, 3, 9, 7};
        int k = 8;
        System.out.println(findPairs(arr, k));   
    }
}

