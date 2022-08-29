package Kattis;

import java.util.Scanner;

public class ColdputerScienceProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            if(x < 0) {
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
