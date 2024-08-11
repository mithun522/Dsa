package Array;

public class InsertElement {

    private static int[] insertElement(int[] arr, int target, int index) {
        int n = arr.length;
        int[] nums = new int[n + 1];

        for (int i = 0; i < index; i++) {
            nums[i] = arr[i];
        }
        nums[index] = target;
        for (int i = index + 1; i < n + 1; i++) {
            nums[i] = arr[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = 2;
        int[] nums = insertElement(arr, target, index);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
