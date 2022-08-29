package Kattis;

import java.util.Scanner;

public class PlaninaProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (int) Math.pow(2, num) + 1;
        System.out.println(result * result);


        // 1 => 9
        // 2 => 25
        // 5 => 1089


        // n = 1
        // 9 = (2^1 + 1) * (2^1 +1)
        // n = 2
        // 25 = (2^2 + 1) * (2^2 + 1)
        // n = 5
        // 1089 = (2^5 + 1) * (2^5 + 1)

    }
}
