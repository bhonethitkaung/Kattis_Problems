package Kattis;

import java.util.Scanner;

public class FaktorProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();

        // i = c/a (original)
        // i + 1 = (c/a) + 1
        // c - 1 = (i - 1) a
        System.out.println((i-1) * a + 1);


    }
}
