package Kattis;

import java.util.Scanner;

public class PotProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int result = 0;
        for(int i=0; i<count; i++) {
            int n = sc.nextInt();
            int pow = n%10;
            int num = n/10;
            result += Math.pow(num, pow);
        }
        System.out.println(result);

    }

}
