package Array;

// https://leetcode.com/problems/sort-colors/description/
public class SortColors {

    private static void sortColors(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    private static void sortColorsOptimized(int[] nums) {
        int n = nums.length, zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        int index = 0;
        while (zeroCount > 0) {
            nums[index] = 0;
            index++;
            zeroCount--;
        }

        while (oneCount > 0) {
            nums[index] = 1;
            index++;
            oneCount--;
        }

        while (twoCount > 0) {
            nums[index] = 2;
            index++;
            twoCount--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColorsOptimized(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
