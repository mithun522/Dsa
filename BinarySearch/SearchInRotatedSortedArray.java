package BinarySearch;

public class SearchInRotatedSortedArray {
    static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            } 
            
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 10, 11, 12, 0, 1, 2, 4, 5, 6};
        int target = 1;
        System.out.println(search(nums, target));;
    }
}