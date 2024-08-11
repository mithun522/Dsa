package Array;

public class MoveZeroes {

    // Brute
    public static void moveZeroes(int[] nums) {
        int n = nums.length, count = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < n) nums[count++] = 0;

    }

    private static void moveZeroesOptimized(int[] nums) {
        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesOptimized(nums);

        for(int i : nums) {
            System.out.println(i);
        }
    }
}