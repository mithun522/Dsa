package Array.Medium;

import java.util.HashMap;

public class SingleNumber_2 {

    // Brute Force
    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        for (int i : mpp.keySet()) {
            if(mpp.get(i) == 1) return i;
        }

        return -1;
    }

    // Optimzed
    private static int singleNumberOptimized(int[] nums) {
        int result = 0;

        for(int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumberOptimized(arr));
    }
}