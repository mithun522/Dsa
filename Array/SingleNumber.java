package Array;

import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(!mpp.containsKey(nums[i])) {
                mpp.put(1, nums[i]);
            } else {
                mpp.put(mpp.get(nums[i]) + 1, nums[i]);
            }
        }

        for( int out : mpp.keySet()) {
            if(mpp.get(out) == 1) return out;
        }
            

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 2, 7, 6, 1, 1, 6};
        System.out.println(singleNumber(nums));
    }
}