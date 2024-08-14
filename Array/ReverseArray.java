package Array;

public class ReverseArray {

    private static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i : arr) System.out.println(i);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverseArray(arr);
    }
    
}
