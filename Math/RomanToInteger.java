package Math;

public class RomanToInteger {

    static int RomanToIntegerValues (Character c) {
        if(c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'M') {
            return 1000;
        } else {
            return -1;
        }
    }

    static int ConvertRomanToInteger(String roman) {
        int out = 0;

        for (int i = 0;i < roman.length(); i++) {
            int value1 = 0;
            int value2 = 0;

            value1 = RomanToIntegerValues(roman.charAt(i));

            if (i+1 < roman.length()) {
                value2 = RomanToIntegerValues(roman.charAt(i+1));

                if(value1 < value2) {
                    out -= value1;
                } else {
                    out += value1;
                }
            } else {
                out += value1;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";

        System.out.println(ConvertRomanToInteger(roman));
    }
}