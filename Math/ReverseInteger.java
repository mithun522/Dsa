package Math;

public class ReverseInteger {

    private static int reverseInteger(int n) {

        int out = 0, r, imp;
        while(n != 0) {
            r = n%10;
            out = (out * 10) + r;
            n = n/10;
        }
        return out;
    }
    
    public static void main(String[] args) {
        int n = -321;
        System.out.println(reverseInteger(n));
    }
}
