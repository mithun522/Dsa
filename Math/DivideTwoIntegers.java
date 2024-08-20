package Math;

// https://leetcode.com/problems/divide-two-integers/
public class DivideTwoIntegers {

    // TODO learn the proper solution
    private static int divideTwoIntegers(int a, int b) {
        int ans = a / b;
    
        if (ans < Integer.MIN_VALUE) return Integer.MAX_VALUE - 1;
        return ans;
    }    
    
    public static void main(String[] args) {
        int a = -2147483648, b = -1;
        System.out.println(divideTwoIntegers(a, b));
    }
}
