package Practice;

public class ReverseInteger {
    
    public static int reverseInteger(int n) {
        int r, out = 0;

        while (n != 0) {
            r = n % 10;
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
