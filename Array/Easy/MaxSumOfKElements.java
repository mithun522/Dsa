package Array.Easy;

// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/submissions/1358409713/
public class MaxSumOfKElements {

    private static int maxSumOfKElements(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            max = Math.max(max, i);
        }

        return k * (2 * max + k - 1) / 2;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSumOfKElements(arr, k));
    }
}
