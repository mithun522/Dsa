package Practice;

import java.util.HashMap;

public class FindSingleNumber {

    private static int findSingleNumber(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        for (int num : mpp.keySet()) {
            if (mpp.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 3, 1, 2, 2};
        System.out.println(findSingleNumber(arr));
    }
}

