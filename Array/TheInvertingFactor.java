package Array;

public class TheInvertingFactor {

    private static int theInvertingFactor(int[] arr) {
        int n = arr.length;
        int[] reversedNums = new int[n];
        
        // Reverse each number in the array
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int reversed = 0;
            
            while (temp != 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
            
            reversedNums[i] = reversed;
        }
        
        // Initialize the minimum difference to a large value
        int minInvertingFactor = Integer.MAX_VALUE;
        
        // Compare every pair and calculate the absolute difference
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(reversedNums[i] - reversedNums[j]);
                minInvertingFactor = Math.min(minInvertingFactor, diff);
            }
        }
        
        return minInvertingFactor;
    }

    public static void main(String[] args) {
        int[] arr = {48, 23, 100, 71, 56, 89};

        System.out.println(theInvertingFactor(arr));
    }
}