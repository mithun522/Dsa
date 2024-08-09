package HashTable;

import java.util.HashMap;

public class TwoSum {
    
    private static int[] returnTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int result = target - arr[i];

            if(mpp.containsKey(result)) {
                return new int[] {mpp.get(result), i};
            }

            mpp.put(arr[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        for(int i: returnTwoSum(arr, target)) {
            System.out.println(i);
        }
    }
}
