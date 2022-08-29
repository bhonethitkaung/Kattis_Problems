package Kattis;

import java.util.Scanner;

public class GCVWRProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();

        float w = (g - t) * 0.9f;
        int sum = 0;
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println((int)w - sum);
    }
}
