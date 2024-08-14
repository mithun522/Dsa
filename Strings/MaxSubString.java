package Strings;

public class MaxSubString {

    // TODO: Solve this
    public static int maxSubString(String S) {
        int n = S.length(), count = 0, max = Integer.MIN_VALUE, indexOfZero = S.indexOf('0');
        String str = S.replace('1', '1');
        str = str.replace('0', '1');

        if (indexOfZero == -1) return -1;
        
        for (int i = indexOfZero; i < n; i++) {
            if(S.charAt(i) == '1') {
                count = count - 1;
            } else {
                count = count + 1;
            }
            
            max = Math.max(max, count);
        }

        if (max <= 0) return -1;

        return max;
    }
    
    public static void main(String[] args) {
        String s = "011111010011";
        System.out.println(maxSubString(s));
    }
}
