package Array.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150
public class HIndex {

    private static int hIndex(int[] nums) {
        int n = nums.length, count = 0;
        Arrays.sort(nums);

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > count) {
                count++;
            } else break;
        }

        return count;

    }
    
    public static void main(String[] args) {
        int[] nums = {3, 0, 6, 1, 5};
        System.out.println(hIndex(nums));
    }
}
