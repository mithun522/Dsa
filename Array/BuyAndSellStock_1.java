package Array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BuyAndSellStock_1 {

    // Brute
    private static int maxProfit(int[] prices) {
        int n = prices.length, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }

        if (max <= 0) return 0;

        return max;
    }

    private static int maxProfitOptimized(int[] prices) {
        int n = prices.length, min = Integer.MAX_VALUE, max = 0;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }

        return max;
    }
    
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfitOptimized(arr));
    }
}
