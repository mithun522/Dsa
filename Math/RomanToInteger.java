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

    static int ConvertRomanToIntegerBrute(String roman) {
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

    private static int ConvertRomanToIntegerOptimized(String s) {
        int res = 0;
        int x = 0;
        int i = s.length() - 1;
        
        while (i >= 0) {
            if (s.charAt(i) == 'I') {
                x = 1;
                i--;
            } else if (s.charAt(i) == 'V') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
                    x = 4;
                    i -= 2;
                } else {
                    x = 5;
                    i--;
                }
            } else if (s.charAt(i) == 'X') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
                    x = 9;
                    i -= 2;
                } else {
                    x = 10;
                    i--;
                }
            } else if (s.charAt(i) == 'L') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
                    x = 40;
                    i -= 2;
                } else {
                    x = 50;
                    i--;
                }
            } else if (s.charAt(i) == 'C') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
                    x = 90;
                    i -= 2;
                } else {
                    x = 100;
                    i--;
                }
            } else if (s.charAt(i) == 'D') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
                    x = 400;
                    i -= 2;
                } else {
                    x = 500;
                    i--;
                }
            } else if (s.charAt(i) == 'M') {
                if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
                    x = 900;
                    i -= 2;
                } else {
                    x = 1000;
                    i--;
                }
            }
            res += x;
        }
        
        return res;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";

        System.out.println(ConvertRomanToIntegerOptimized(roman));
    }
}