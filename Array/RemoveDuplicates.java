package Array;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        int arr[] = new int[n];

        for(int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[n - i] = nums[i]; 
            }
        }

        for(int i : nums) System.out.println(i);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, 4, 4 };
        System.out.println(removeDuplicates(arr));
    }
}