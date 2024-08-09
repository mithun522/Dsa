package Patterns;

public class Pattern {

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 0;i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern5(n);
    }
}