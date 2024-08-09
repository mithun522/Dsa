package BinarySearch;

public class FirstAndLastPosition {

    // Brute Force approach
    private static int[] findFirstAndLastPosition(int[] nums, int target) {
        int n = nums.length;
        int store = -1;
        int index = 0;

        int start = 0, end = n;

        for (start = 0; start < end; start++) {
            if (nums[start] == target) {
                store = start;
                break;
            }
        }

        for (end = store; end < n; end++) {
            if (nums[end] != target) {
                index = end - 1;
                System.out.println(index);
                break;
            }
        }

        return new int[] {store, index};
    }
    
    public static void main(String[] args) {
       int[] nums = {5, 7, 7, 8, 8, 8 };
       int target = 8;

        for(int i : findFirstAndLastPosition(nums, target)) {
            System.out.println(i);
        }
    }
}
