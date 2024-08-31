package BinarySearch;

public class FindMinimumInRotatedSortedArray {

    private static int findMin(int[] nums) {
        int n = nums.length, low = 0, high = n - 1, ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (low <= high) {
                ans = Math.min(ans, nums[low]);
            }

            if (low <= mid) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 10, 11, 12, 0, 1, 2, 4, 5, 6};
        System.out.println(findMin(nums));
    }
}
