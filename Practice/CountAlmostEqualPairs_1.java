package Practice;

public class CountAlmostEqualPairs_1 {
    
    private static int reverse(int n) {
        int r, out = 0;

        while (n != 0) {
            r = n % 10;
            out = (out * 10) + r;
            n = n / 10;
        }

        return out;
    }

    public int countPairs(int[] nums) {
        int n = nums.length, count = 0;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int com = reverse(nums[i]);

            if (left < n) {
                if (nums[left] == com) {
                    count++;
                };
                left++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,12,30,17,21};

        System.out.println(new CountAlmostEqualPairs_1().countPairs(nums));
    }
}
