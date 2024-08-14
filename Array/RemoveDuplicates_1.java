package Array;

public class RemoveDuplicates_1 {

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int uniqueIndex = 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,5,5,6};
        // result = 0 1 2 3 5 6
        System.out.println(removeDuplicates(arr));
    }
}