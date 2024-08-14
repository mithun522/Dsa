package Array.Hard;

import java.util.Arrays;

// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    
    public static int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);

        int smallestMissingPositiveInteger = 1;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == smallestMissingPositiveInteger) {
                smallestMissingPositiveInteger++;
            }
        }

        return smallestMissingPositiveInteger;
    }

    // TODO: Optimize this

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }
}
