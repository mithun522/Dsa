package Matrix;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {

    private static int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int maxWealth = 0;
            for (int j = 0; j < arr[i].length; j++) {
                maxWealth += arr[i][j];
            }

            max = Math.max(max, maxWealth);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
}
