package Kattis;

import java.util.Scanner;

public class DiceCupProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] sum = new int[d1*d2];

        for (int i = 1; i <= d1; i++) {
            for (int j = 1; j <= d2; j++) {
                sum[i + j] += 1;
            }
        }

        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] != 0 && max < sum[i]) {
                max = sum[i];
            }
        }
        for(int j=0; j<sum.length; j++) {
            if(max == sum[j]) {
                System.out.println(j);
            }
        }
        sc.close();
    }
}
