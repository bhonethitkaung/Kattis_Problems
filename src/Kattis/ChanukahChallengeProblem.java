package Kattis;

import java.util.Scanner;

public class ChanukahChallengeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int count = sc.nextInt();
            int num = sc.nextInt();
            int sum = 0;
            for(int j=1; j<=num; j++) {
                sum += j;
            }
            System.out.println(count + " " + (sum + num));
        }
    }
}
