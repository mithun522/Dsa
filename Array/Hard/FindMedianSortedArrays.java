package Array.Hard;

import java.util.ArrayList;
import java.util.Collections;

// https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);
        double result = 0.0;

        int size = list.size();

        if (list.size() % 2 == 0) {
            int mid1 = (size / 2) - 1;
            int mid2 = size / 2;
            result = (list.get(mid1) + list.get(mid2)) / 2.0;
        } else {
            result = Double.valueOf(list.get((list.size()) / 2));
        }

        return result;
    }

    // TODO: Optimize this

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
