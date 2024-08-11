package Array;

import java.util.HashSet;

public class FindDuplicate {

    // Brute force approach
    private static int findDuplicate (int[] arr) {
        int out = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    out = arr[i];
                    break;
                }
            }
        }

        return out;
    }

    private static int findDuplicateBetter(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }

        return -1;
    }

    private static int findDuplicateOptimized(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int ind = Math.abs(arr[i]);

            if(arr[ind] < 0)
            return ind;

            arr[ind] = -arr[ind];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicateOptimized(arr));
    }
}