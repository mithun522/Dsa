package Math;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/average4856/1?page=1&difficulty=School&sortBy=submissions
public class PrefixSum {

    private static ArrayList<Integer> prefixSum(ArrayList<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int cumulativeSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            cumulativeSum += arr.get(i);
            list.add(cumulativeSum / (i + 1));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(prefixSum(arr));
    }
}
