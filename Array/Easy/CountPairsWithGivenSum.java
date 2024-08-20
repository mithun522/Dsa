package Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    
    public static int countPairsWithGivenSum(int[] arr, int n, int target) {
        int count = 0;

        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0; i<n ;i++)
        {
            int k = Math.abs(target - arr[i]);
            if(map1.containsKey(k)){
                count = count + map1.get(k);
            }
            map1.put(arr[i], map1.getOrDefault(arr[i],0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 7, -1, 4, 4};
        int sum = 6;
        System.out.println(countPairsWithGivenSum(arr, arr.length, sum));
    }
}
