package Kattis;

import java.util.Scanner;

public class ElectricalOutletsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int sum = 0;
            int x = sc.nextInt();
            for(int j=0; j<x; j++) {
                int y = sc.nextInt();
                sum += y - 1;
            }
            System.out.println(sum + 1);
        }
        sc.close();
    }
}
