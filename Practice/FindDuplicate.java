package Practice;

import java.util.HashMap;

public class FindDuplicate {

    private static int findDuplicate(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(mpp.containsKey(arr[i])) {
                return arr[i];
            }

            mpp.put(arr[i], 1);
        }

        for(int i : mpp.keySet()) {
            if(i == 1) return 1;
        }

        return -1;
    }
    
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
}
