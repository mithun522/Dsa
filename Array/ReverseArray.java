package Array;

public class ReverseArray {

    private static void reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for(int i = arr.length - 1; i >=0 ; i--) {
            newArr[i + count ] = arr[i];
            count++;
        }

        for(int i : arr) System.out.println(i);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverseArray(arr);
    }
    
}
