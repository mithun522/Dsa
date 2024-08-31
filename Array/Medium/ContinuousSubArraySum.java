package Array.Medium;

public class ContinuousSubArraySum {

    private static boolean continuousSubArraySum(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                temp+=nums[j];
                System.out.print(temp + " " + i + "," +j + " ");
            }
            System.out.println();
        }

        return false;
    }
    
    // https://leetcode.com/problems/continuous-subarray-sum/
    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(continuousSubArraySum(arr, k));
    }
}
