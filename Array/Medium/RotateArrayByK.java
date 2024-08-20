package Array.Medium;

public class RotateArrayByK {

    private static void rotateArrayByK(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        if (k == 0) return;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
            // i = n - k - 1
            // i = 7 - 3 - 1 => i = 3; 
            // nums[3 + 3] = nums[3]; => nums[6] = nums[3] => 1 2 3 4 5 6 7 => o/p = 1 2 3 4 5 6 4
            // nums[2 + 3] = nums[2]; => nums[5] = nums[2] => 1 2 3 4 5 6 4 => o/p = 1 2 3 4 5 3 4
            // nums[1 + 3] = nums[1]; => nums[4] = nums[1] => 1 2 3 4 5 3 4 => o/p = 1 2 3 4 2 3 4
            // nums[0 + 3] = nums[0]; => nums[3] = nums[0] => 1 2 3 4 2 3 4 => o/p = 1 2 3 1 2 3 4
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    private static void rotateArrayByKOptimal(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        // o/p = {5 6 7 1 2 3 4}
        rotateArrayByKOptimal(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
