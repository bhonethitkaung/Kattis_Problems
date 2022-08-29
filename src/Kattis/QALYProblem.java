package Kattis;

import java.util.Scanner;

public class QALYProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float result = 0.0f;
        for(int i=0; i<n; i++) {
            float q = sc.nextFloat();
            float y = sc.nextFloat();
            result += q * y;
        }
        System.out.println(result);
    }
}
