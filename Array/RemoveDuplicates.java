package Array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count < 2 || nums[i] != nums[count - 2]) {
                nums[count] = nums[i]; // Modify the array in place
                count++;
            }
        }

        return count; // Return the length of the modified array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength of modified array: " + k);
    }
}
