package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/3sum/description/
public class ThreeSum {

    // Brute Force approach
    private static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> ls = new ArrayList<>();

                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);

                        Collections.sort(ls);

                        list.add(ls);
                    }
                }
            }
        }

        return new ArrayList<>(list);
    }

    // TODO: Optimize this

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };

        System.out.println(threeSum(nums));
    }
}
