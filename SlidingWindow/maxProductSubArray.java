package SlidingWindow;

public class MaxProductSubArray {

    private static int maxProductSubArray(int[] arr) {
        int n = arr.length, maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int currentProduct = 1;
            for(int j = i; j < n; j++) {
                currentProduct*=arr[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        
        return maxProduct;
    }

    // private static int maxProductSubArrayOptimized(int[] arr) {
    //     int n = arr.length, maxProduct = Integer.MIN_VALUE;

    //     return maxProduct;
    // }


    public static void main(String[] args) {

        int[] arr = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProductSubArray(arr));
    }
}

