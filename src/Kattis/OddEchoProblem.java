package Kattis;

import java.util.Scanner;

public class OddEchoProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++) {
            String s = sc.nextLine();
            if(i%2!=0) {
                System.out.println(s);
            }
        }
    }
}
