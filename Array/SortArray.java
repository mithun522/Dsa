package Array;

public class SortArray {

    // Brute force
    private static int[] sortArray(int[] arr) {

        for (int i = 0 ; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    // TODO: Optimize 
    private static int[] sortArrayOptimized(int[] arr) {
        int n = arr.length;
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        int[] out = sortArrayOptimized(arr);
        for(int i : out) System.out.println(i);
    }
}