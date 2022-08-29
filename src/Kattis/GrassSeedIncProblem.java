package Kattis;

import java.util.Scanner;

public class GrassSeedIncProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cost = sc.nextFloat();
        int row = sc.nextInt();

        float result = 0;
        for(int i=0; i<row; i++) {
            float l = sc.nextFloat();
            float w = sc.nextFloat();

            result += (l * w) * cost;
        }
        System.out.println(String.format("%.7f", result));
    }

}
